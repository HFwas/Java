package com.hfwas.java.chapter08;

/**
 * @Author: HFwas
 * @Date: 2021/1/22
 * @Description: com.hfwas.java.chapter08
 * -Xms10m   -Xmx10m
 * @version: 1.0
 */
public class HeapDemo {
    public static void main(String[] args) {
        System.out.println("线程开始");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程结束");
    }
}
