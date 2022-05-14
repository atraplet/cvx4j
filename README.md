# Convex Optimization for Java

## Build jextract

Clone [jextract](https://github.com/openjdk/jextract)

```
git clone git@github.com:openjdk/jextract.git
```

On WSL2 build

```
export LD_LIBRARY_PATH=/usr/lib/llvm-10/lib
cd jextract
sh ./gradlew -Pjdk18_home=/usr/lib/jvm/zulu18 -Pllvm_home=/usr/lib/llvm-10 clean verify
```

and test

```
./build/jextract/bin/jextract --version
```
