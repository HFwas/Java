package com.hfwas.java.chapter05;

/**
 * @Author: HFwas
 * @Date: 2021/1/20
 * @Description: com.hfwas.java.chapter05
 * 演示栈中的异常
 * 默认情况下：count=11406
 * 设置栈大小之后：-Xss256k之后 count=2459
 * @version: 1.0
 */
public class StackErrorTest {
    private static int num = 1;
    public static void main(String[] args) {
        System.out.println(num);
        num++;
        //Exception in thread "main" java.lang.StackOverflowError
        main(args);
    }
}
