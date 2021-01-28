package com.hfwas.java1.chapter01;

/**
 * @Author: HFwas
 * @Date: 2021/1/28
 * @Description: com.hfwas.java1.chapter01
 * @version: 1.0
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer x = 5;
        int y = 5;
        //true
        System.out.println(x == y);

        Integer num1 = 10;
        Integer num2 = 10;
        //true
        System.out.println(num1 == num2);

        Integer num3 = 128;
        Integer num4 = 128;
        //false
        System.out.println(num3 == num4);
    }
}
