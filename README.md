# Convex Optimization for Java

*This library is work in progress.*

cvx4j (Convex Optimization for Java) is a Java library for convex optimization. It relies on the native open source
solvers [OSQP](https://github.com/osqp/osqp), [ECOS](https://github.com/embotech/ecos), and
[SCS](https://github.com/cvxgrp/scs), and invokes them through
[Project Panama’s](https://openjdk.java.net/projects/panama/) Foreign Function and Memory API.

The native solvers must be installed on the machine. cvx4j doesn't ship any native implementation. cvx4j dynamically
loads the native solvers using the `java.library.path` in order to locate the native libraries.

cvx4j requires Java 18 and has been tested on Windows 10 and Ubuntu 20.04 (WSL2) using the Zulu build of the OpenJDK.
Since Panama is incubating in Java 18 `--add-modules jdk.incubator.foreign` is required. Additionally, use
`-native-access=ALL-UNNAMED` to allow classpath based code to invoke the native code.

## Create stubs

### Build jextract

Build [jextract](https://github.com/openjdk/jextract)

```
export LD_LIBRARY_PATH=/usr/lib/llvm-10/lib
sh ./gradlew -Pjdk18_home=/usr/lib/jvm/zulu18 -Pllvm_home=/usr/lib/llvm-10 clean verify
```

Test

```
./build/jextract/bin/jextract --version
```

### Create ECOS stubs

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
