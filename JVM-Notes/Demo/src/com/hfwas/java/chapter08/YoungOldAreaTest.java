package com.hfwas.java.chapter08;

/**
 * @Author: HFwas
 * @Date: 2021/1/22
 * @Description: com.hfwas.java.chapter08
 *
 * 测试：大对象直接进入老年嗲
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 * @version: 1.0
 */
public class YoungOldAreaTest {
    public static void main(String[] args) {
        //20m
        byte[] bytes = new byte[1024 * 1024 * 20];
    }
}
