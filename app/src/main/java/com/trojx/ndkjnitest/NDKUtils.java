package com.trojx.ndkjnitest;

/**
 * Created by Administrator on 2016/2/21.
 */
public class NDKUtils {
    static {
        System.loadLibrary("JniLibName");//加载库文件
    }
    public native String getStringFromC();
}
