package com.hfwas.java.chapter02;

/**
 * @Author: HFwas
 * @Date: 2021/1/20
 * @Description: com.hfwas.java.chapter02
 * 双亲委派机制
 * @version: 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        java.lang.String s = new java.lang.String();
        //hello,hfwas
        System.out.println("hello,hfwas");

        StringTest stringTest = new StringTest();
        //sun.misc.Launcher$AppClassLoader@18b4aac2
        //系统类加载器
        System.out.println(stringTest.getClass().getClassLoader());
    }
}
