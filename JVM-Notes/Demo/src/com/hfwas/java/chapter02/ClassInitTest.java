package com.hfwas.java.chapter02;

/**
 * @Author: HFwas
 * @Date: 2021/1/20
 * @Description: com.hfwas.java.chapter02
 * @version: 1.0
 */
public class ClassInitTest {
    private static int num = 1;
    static {
        num = 2;
        number = 3;
        //2
        System.out.println(num);

        //报错，非法的前向引用
        //System.out.println(number);
    }

    //linking中的prepare:number = 0 --> initial: 3 --> 10
    private static int number = 10;

    public static void main(String[] args) {
        //2
        System.out.println(ClassInitTest.num);
        //10
        System.out.println(ClassInitTest.number);
    }
}
