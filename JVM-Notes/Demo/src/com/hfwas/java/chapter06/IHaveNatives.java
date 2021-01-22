package com.hfwas.java.chapter06;

/**
 * @Author: HFwas
 * @Date: 2021/1/22
 * @Description: com.hfwas.java.chapter06
 * 本地方法
 * @version: 1.0
 */
public class IHaveNatives {
    public native void Native1(int x);

    public native static long Native2();

    private native synchronized float Native3(Object o);

    native void Native4(int[] array) throws Exception;
}
