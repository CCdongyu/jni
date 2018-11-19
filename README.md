## Synopsis

This is a demo that shows how the JNI(Java Name Interface) performed in Java with C/C++.

Use the command `gcc -fPIC -I /usr/lib/jvm/java-8-oracle/include -I /usr/lib/jvm/java-8-oracle/include/linux -shared -o libJNI.so pers_ccdongyu_jni_JNITest.cpp` to compile the file, which the path `/usr/lib/jvm/java-8-oracle` is the `JAVA_HOME`.

## Usage

cd java sources folder.

javac pers/ccdongyu/jni/JNITest.java 
java pers/ccdongyu/jni/JNITest

## Attention

Use the command `javah` to generate the JNI header.

Use the command `gcc -fPIC -I /usr/lib/jvm/java-8-oracle/include -I /usr/lib/jvm/java-8-oracle/include/linux -shared -o libJNI.so pers_ccdongyu_jni_JNITest.cpp` to compile the library.

The method `System.loadLibrary()` scans the `/usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib` to locate the library such as `libJNI.so` in this demo.
Print thoes paths with `System.getProperty("java.library.path")` in Java.
Use the environment variable `LD_LIBRARY_PATH` to specify the customed path in your system. Such as `export LD_LIBRARY_PATH=.:$LD_LIBRARY_PATH`.
