package com.hfwas.java.chapter08;

/**
 * @Author: HFwas
 * @Date: 2021/1/23
 * @Description: com.hfwas.java.chapter08
 * 同步省略说明
 * @version: 1.0
 */
public class SynchronizedTest {
    public static void main(String[] args) {
        Object o = new Object();
        synchronized (o) {
            System.out.println("hello world");
        }
    }
}
