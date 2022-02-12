package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2021/1/1
 * @Description: com.hfwas.demo03
 * StringBuilder的常用方法:
 *         public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
 * @version: 1.0
 */
public class Demo03StringBuilder {

    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this,调用方法的对象bu,this==bu
        StringBuilder str2 = str1.append("abc");
        //abc
        System.out.println(str1);
        //abc
        System.out.println(str2);

        //比较两个对象,,,true
        System.out.println(str1 == str2);

        str1.append("aa");
        str1.append(12);
        str1.append("中");
        str1.append(" ");
        str1.append("df");
        //abcaa12中 df
        System.out.println(str1);

        //链式编程：方法返回值是一个对象，该对象可以继续调用方法
        StringBuilder append = str2.append("ad").append(12).append("中");
        System.out.println(append);

        String s = "adf";
        System.out.println(s.toLowerCase().toUpperCase());
    }

}
