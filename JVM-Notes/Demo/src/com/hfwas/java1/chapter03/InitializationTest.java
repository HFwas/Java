package com.hfwas.java1.chapter03;

/**
 * @Author: HFwas
 * @Date: 2021/1/31
 * @Description: com.hfwas.java1.chapter03
 * 过程三：初始化阶段
 * @version: 1.0
 */
public class InitializationTest {
    public static int id = 1;
    public static int number;

    static {
        number = 2;
        System.out.println("father static");
    }
}
