package com.hfwas.java1.chapter02;

/**
 * @Author: HFwas
 * @Date: 2021/1/31
 * @Description: com.hfwas.java1.chapter02
 * 补充：方法调用指令的补充说明
 * @version: 1.0
 */
public class InterfaceMethodTest {
    public static void main(String[] args) {
        AA aa = new BB();
        aa.method2();
        AA.method1();
    }
}

interface AA{
    public static void method1(){

    }

    public default void method2(){

    }
}

class BB implements AA{

}
