//
// Created by HeinHtet on 2019-10-10.
//

#include <jni.h>

extern "C" {
    JNIEXPORT jstring JNICALL
    Java_com_deevd_ndkexample_MainActivity_invokeNativeFunction(JNIEnv *env, jobject instance) {
        return env->NewStringUTF("V293ISBob3cgY3VyaW91cyBlaD8=");
    }
}