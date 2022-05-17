# Convex Optimization for Java

## Build jextract

Build

```
export LD_LIBRARY_PATH=/usr/lib/llvm-10/lib
sh ./gradlew -Pjdk18_home=/usr/lib/jvm/zulu18 -Pllvm_home=/usr/lib/llvm-10 clean verify
```

Test

```
./build/jextract/bin/jextract --version
```

## Create stubs

### ECOS

```
$JEXTRACT_HOME/build/jextract/bin/jextract \
    -D DLONG \
    -D LDL_LONG \
    -DSuiteSparse_long="long long" \
    -I $ECOS_HOME/external/SuiteSparse_config \
    -l ecos \
    -t com.ustermetrics.ecos.stubs \
    --include-function ECOS_setup \
    --include-function ECOS_solve \
    --include-function ECOS_cleanup \
    --include-function ECOS_ver \
    --include-struct pwork \
    --include-struct stats \
    --source \
    --output src/main/java \
    $ECOS_HOME/include/ecos.h
```

