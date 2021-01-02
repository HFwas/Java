package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2021/1/1
 * @Description: com.hfwas.demo03
 * java.lang.StringBuilder类:字符串缓冲区,可以提高字符串的效率
 *     构造方法:
 *         StringBuilder() 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
 *         StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
 * @version: 1.0
 */
public class Demo02StringBuilder {

    public static void main(String[] args) {
        //空参构造方法
        StringBuilder str1 = new StringBuilder();
        //""
        System.out.println(str1);

        //有参构造方法
        StringBuilder str2 = new StringBuilder("abc");
        //abc
        System.out.println(str2);
    }

}
