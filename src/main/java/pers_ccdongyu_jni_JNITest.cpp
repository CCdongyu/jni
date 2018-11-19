#include <stdio.h>
#include "pers_ccdongyu_jni_JNITest.h"

JNIEXPORT void JNICALL Java_pers_ccdongyu_jni_JNITest_sayHello(JNIEnv *, jobject)
{
    printf("Hello World!\n");
}