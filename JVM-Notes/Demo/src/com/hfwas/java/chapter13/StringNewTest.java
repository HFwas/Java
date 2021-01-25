package com.hfwas.java.chapter13;

/**
 * @Author: HFwas
 * @Date: 2021/1/25
 * @Description: com.hfwas.java.chapter13
 * new String("hfwas")会创建几个对象
 *
 * new String("hf") + new String("was")呢？？
 * @version: 1.0
 */
public class StringNewTest {
    public static void main(String[] args) {
        //String s = new String("hfwas");
        String s1 = new String("hf") + new String("was");
    }
}
