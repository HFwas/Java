package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/13
 * @Description: Math工具类,里面提供了大量的静态方法，完成于数学运算相关的操作
 * public static double abs(double num):获取绝对值
 * public static double ceil(double num):向上取整
 * public static double floor(double num):向下取整
 * public static double round(double num):四舍五入
 * @version: 1.0
 */
public class MathDemo {

    public static void main(String[] args) {
        //获取绝对值
        //2.5
        System.out.println(Math.abs(-2.5));

        //向上取整
        //3.0
        System.out.println(Math.ceil(2.6));
        //3.0
        System.out.println(Math.ceil(2.3));
        //-2.0
        System.out.println(Math.ceil(-2.3));

        //向下取整,抹零
        //2.0
        System.out.println(Math.floor(2.3));
        //2.0
        System.out.println(Math.floor(2.8));
        //-3.0
        System.out.println(Math.floor(-2.8));
        //-3.0
        System.out.println(Math.floor(-2.1));

        //四舍五入
        //3
        System.out.println(Math.round(2.6));
        //2
        System.out.println(Math.round(2.1));
        //-3
        System.out.println(Math.round(-2.6));
        //-2
        System.out.println(Math.round(-2.1));

        /*
        题目：计算再-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？ */
        int count = 0;

        double min = -10.8;
        double max = 5.9;
        for (int i = (int)min; i < max; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("总共有：" + count);
    }

}
