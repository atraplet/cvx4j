# cvx4j
Convex Optimization for Java

## Build jextract

Clone [jextract](https://github.com/openjdk/jextract).

On WSL2 build with

```
export LD_LIBRARY_PATH=/usr/lib/llvm-10/lib
sh ./gradlew -Pjdk18_home=/usr/lib/jvm/zulu18 -Pllvm_home=/usr/lib/llvm-10 clean verify
```

Use

```
./build/jextract/bin/jextract
```
