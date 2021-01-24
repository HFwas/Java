package com.hfwas.java.chapter09;

/**
 * @Author: HFwas
 * @Date: 2021/1/23
 * @Description: com.hfwas.java.chapter09
 * 测试设置方法区大小参数的默认值
 *      jdk1.7: -XX:PermSize=100m  -XX:MaxPermSize=100m
 *       jdk1.8之后：-XX:MetaspaceSize=100m         -XX:MaxMetaspaceSize=100m
 * @version: 1.0
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("开始了");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束了");
    }
}
