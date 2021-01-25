package com.hfwas.java.chapter13;

/**
 * @Author: HFwas
 * @Date: 2021/1/25
 * @Description: com.hfwas.java.chapter13
 * @version: 1.0
 */
public class StringInter1 {
    public static void main(String[] args) {
        //new String("11")
        String s3 = new String("1") + new String("1");
        //执行完上一行代码以后，字符串常量池中，是否存在"11"呢??答案是：不存在！！

        //在字符串常量池中生成对象"11"
        String s4 = "11";

        String s5 = s3.intern();

        //根据12行与14行位置的变换，比较两个对象的值也会发生变化
        //false
        System.out.println(s3 == s4);
        //true
        System.out.println(s4 == s4);
    }
}
