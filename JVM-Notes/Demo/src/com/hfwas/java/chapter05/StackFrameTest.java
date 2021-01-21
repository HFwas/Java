package com.hfwas.java.chapter05;

/**
 * @Author: HFwas
 * @Date: 2021/1/20
 * @Description: com.hfwas.java.chapter05
 * @version: 1.0
 */
public class StackFrameTest {
    public static void main(String[] args) {
        StackFrameTest sf = new StackFrameTest();
        sf.demo01();
    }

    private void demo01() {
        System.out.println("方法1开始了");
        demo02();
        System.out.println("方法1结束了");
    }

    private int demo02() {
        System.out.println("方法2开始了");
        int num = 10;
        int num2 = (int)demo03();
        System.out.println("方法2即将结束");
        return num + num2;
    }

    private double demo03() {
        System.out.println("方法3开始了");
        double num3 = 10.0;
        System.out.println("方法3即将结束了");
        return num3;
    }
}
