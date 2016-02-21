//
// Created by Administrator on 2016/2/21.
//
#include "com_trojx_ndkjnitest_NDKUtils.h"

JNIEXPORT jstring JNICALL Java_com_trojx_ndkjnitest_NDKUtils_getStringFromC
        (JNIEnv *env, jobject obj){
    return (*env)->NewStringUTF(env,"String From C");
}

