package com.hfwas.java1.chapter03;

/**
 * @Author: HFwas
 * @Date: 2021/2/1
 * @Description: com.hfwas.java1.chapter03
 * 那些场景下，Java编译器就不会生成<clinit>()方法
 * @version: 1.0
 */
public class InitializationTest1 {
    //场景1：对于非静态的字段，不管是否进行了显示赋值，都不会生成<clinit>()方法
    public int num = 1;
    //场景2：静态的字段，没有显示的赋值，不会生成<clinit>()方法
    public static int num2;
    //场景3：比如对于声明为static final的基本数据类型的字段，不管是否进行了显示赋值，都不会生成<clinit>()方法
    public static final int num3 = 1;
}
