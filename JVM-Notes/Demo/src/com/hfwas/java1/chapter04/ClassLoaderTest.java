package com.hfwas.java1.chapter04;

/**
 * @Author: HFwas
 * @Date: 2021/2/1
 * @Description: com.hfwas.java1.chapter04
 * @version: 1.0
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);

    }
}
