package com.hfwas.java.chapter13;

/**
 * @Author: HFwas
 * @Date: 2021/1/25
 * @Description: com.hfwas.java.chapter13
 * @version: 1.0
 */
public class StringExer {
    String str = new String("good");
    char[] chars = {'h','f','w','a','s'};

    public static void main(String[] args) {
        StringExer exer = new StringExer();
        exer.change(exer.str,exer.chars);
        //bfwas
        System.out.println(exer.chars);
        //good
        System.out.println(exer.str);
    }

    private void change(String str,char[] chars) {
        str = "test ok";
        chars[0] = 'b';
    }
}
