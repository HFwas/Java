package com.hfwas.java.chapter05;

/**
 * @Author: HFwas
 * @Date: 2021/1/21
 * @Description: com.hfwas.java.chapter05
 * @version: 1.0
 */
public class DynamicLinkingTest {

    int num = 10;

    public static void main(String[] args) {

    }

    public void demo02() {
        System.out.println("demo01....");
    }

    public void demo01() {
        System.out.println("demo02......");
        demo01();
        num++;
    }
}
