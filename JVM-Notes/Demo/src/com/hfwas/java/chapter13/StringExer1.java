package com.hfwas.java.chapter13;

/**
 * @Author: HFwas
 * @Date: 2021/1/25
 * @Description: com.hfwas.java.chapter13
 * string类中Inter()的方法的巩固练习
 * @version: 1.0
 */
public class StringExer1 {
    public static void main(String[] args) {

        //String x = "ab";

        //new String("ab")
        String s1 = new String("a") + new String("b");
        //执行完上一行代码以后，字符串常量池中，是否存在"11"呢??答案是：不存在！！

        //jdk6中:在串池当中创建一个字符串"ab"
        //jdk8中:串池中没有创建字符串"ab",而是创建一个引用，指向new String("ab"),将此引用返回
        String s2 = s1.intern();

        //jdk6:false    jdk7/8:true
        System.out.println(s1 == "ab");
        //jdk6:true     jdk7/8:true
        System.out.println(s2 == "ab");
    }
}
