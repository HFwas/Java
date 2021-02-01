package com.hfwas.java1.chapter03;

/**
 * @Author: HFwas
 * @Date: 2021/1/31
 * @Description: com.hfwas.java1.chapter03
 * 过程2：连接阶段
 *
 * 基本数据类型：非finaL修饰的变星，在准备环节进行默认初始化赋值
 *              finaL修饰以后，在准备环节直接进行显示赋值。
 * 拓展：如果使用它面量的方式定义一个字符串的常量的话，也是在准备环节直接进行显示赋值
 * @version: 1.0
 */
public class LinkingTest {
    private static long id;
    private static final int num = -1;
    public static final String constStr = "CONST";

    //public static final String constStr1 = new String("CONST");
}
