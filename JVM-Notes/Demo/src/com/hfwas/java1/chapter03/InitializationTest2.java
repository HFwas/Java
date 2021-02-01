package com.hfwas.java1.chapter03;

import java.util.Random;

/**
 * @Author: HFwas
 * @Date: 2021/2/1
 * @Description: com.hfwas.java1.chapter03
 * 说明：使用static+final修饰的字段的显式赋值的操作，到底是在哪个阶段进行的赋值？
 *      情况1：在链接阶段的准备环节赋值
 *      情况2：在初始化阶段<clinit>()赋值
 * 结论：
 * 在链接阶段的准备环节赋值的情况
 * 1.对基本数据类型的字段来说，如果使用 static finaL修饰，则显式赋值通常是在链接阶段的准备环节进行
 * 2.对于String来说，如果使用字面量的方式赋值，使用 static finaL修饰的，则显式赋值通常是在链接阶段的准备环进行
 *
 * 在初始化阶段< cLinit>()中赋值的情况
 * 除上述的在注备环节赋值的情况之外的情况。
 *
 * 最终结论：
 *  最终结论：使用 static+final修饰，且显示赋值中不涉及到方法或构造器调用的基本数据类型trng类型的显式赋值，是
 *  在链接阶段的准备环节进行
 * @version: 1.0
 */
public class InitializationTest2 {
    //在初始化阶段<clinit>()赋值
    public static int a = 1;
    //在链接阶段的准备环节赋值
    public static final int INT_CONSTANT = 10;

    //在初始化阶段<clinit>()赋值
    public static final Integer INTEGER_CONSTANT1 = Integer.valueOf(100);
    //在初始化阶段<clinit>()赋值
    public static Integer INTEGER_CONSTANT2 = Integer.valueOf(1000);

    //在链接阶段的准备环节赋值
    public static final String s0 = "hello world0";
    //在初始化阶段<clinit>()赋值
    public static final String s1 = new String("hello world1");

    //
    public static String s = "helloworld2";

    // //在初始化阶段<clinit>()赋值
    public static final int num = new Random().nextInt(10);
}
