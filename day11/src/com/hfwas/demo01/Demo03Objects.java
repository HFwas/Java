package com.hfwas.demo01;

import java.util.Objects;

/**
 * @Author: HFwas
 * @Date: 2021/1/1
 * @Description: com.hfwas.demo01
 * @version: 1.0
 */
public class Demo03Objects {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aaa";
        String s4 = "abc";
        String s3 = null;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        /**
         * objects会对两个对象进行比较，防止空指针异常
         * public static boolean equals(Object a, Object b) {
         *    return (a == b) || (a != null && a.equals(b));
         * }
         */
        System.out.println(Objects.equals(s1,s3));

        //NullPointerException,null不能调用方法，会抛出异常
        System.out.println(s3.equals(s1));
    }

}
