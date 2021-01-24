package com.hfwas.java.chapter10;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Author: HFwas
 * @Date: 2021/1/24
 * @Description: com.hfwas.java.chapter10
 * -Xmx20m -XX:MaxDirectMemorySize=10m
 * @version: 1.0
 */
public class MaxDirectMemorySizeTest {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field field = Unsafe.class.getDeclaredFields()[0];
        field.setAccessible(true);
        Unsafe o = (Unsafe)field.get(null);
        while (true) {
            o.allocateMemory(_1MB);
        }
    }
}
