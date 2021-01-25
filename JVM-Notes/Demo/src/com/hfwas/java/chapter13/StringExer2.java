package com.hfwas.java.chapter13;

/**
 * @Author: HFwas
 * @Date: 2021/1/25
 * @Description: com.hfwas.java.chapter13
 * @version: 1.0
 */
public class StringExer2 {
    public static void main(String[] args) {
        //String s1 = new String("ab");

        String s1 = new String("a") + new String("b");

        s1.intern();

        String s2 = "ab";
        System.out.println(s1 == s2);
    }
}
