package com.hfwas.java.chapter08;

/**
 * @Author: HFwas
 * @Date: 2021/1/23
 * @Description: com.hfwas.java.chapter08
 * 测试：-XX:UseTLAB参数是否开启的情况:默认情况下是开启的
 * @version: 1.0
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
