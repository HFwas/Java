package com.hfwas.java1.chapter01;

/**
 * @Author: HFwas
 * @Date: 2021/1/28
 * @Description: com.hfwas.java1.chapter01
 * @version: 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        String str = new String("hello") + new String("hfwas");
        String str1 = "hellohfwas";
        System.out.println(str == str1);
    }
}
