package com.hfwas.java.chapter13;

import org.junit.Test;

/**
 * @Author: HFwas
 * @Date: 2021/1/25
 * @Description: com.hfwas.java.chapter13
 * string的基本使用：体现string的不可变性
 * @version: 1.0
 */
public class StringTest1 {
    public static void main(String[] args) {
        //demo01();
        //demo02();
    }

    @Test
    public void test01(){
        String s1 = "hfwas";
        String s2 = s1.replace("h", "a");
        //hfwas
        System.out.println(s1);
        //afwas
        System.out.println(s2);
    }

    private static void demo02() {
        String string1 = "hfwas";
        String string2 = "hfwas";

        string1 += "hh";

        //hfwashh
        System.out.println(string1);
        //hfwas
        System.out.println(string2);
    }

    private static void demo01() {
        //字面量定义的方式，"abc"存储在字符串常量池中
        String s1 = "hfwas";
        String s2 = "hfwas";

        s1 = "hello";

        //false
        System.out.println(s1 == s2);
        //hello
        System.out.println(s1);
        //hfwas
        System.out.println(s2);
    }
}
