package com.hfwas.java.chapter13;

/**
 * @Author: HFwas
 * @Date: 2021/1/25
 * @Description: com.hfwas.java.chapter13
 * 字符串基本操作案例二：
 * @version: 1.0
 */
public class Memory {
    public static void main(String[] args) {
        int num = 10;
        Object o = new Object();
        Memory memory = new Memory();
        memory.foo(o);
    }

    private void foo(Object o) {
        String string = o.toString();
        System.out.println(string);
    }
}
