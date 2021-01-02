package com.hfwas.demo04;

/**
 * @Author: HFwas
 * @Date: 2021/1/2
 * @Description: com.hfwas.demo04
 * 基本类型与字符串类型之间的相互转换
 *     基本类型->字符串(String)
 *         1.基本类型的值+""  最简单的方法(工作中常用)
 *         2.包装类的静态方法toString(参数),不是Object类的toString() 重载
 *             static String toString(int i) 返回一个表示指定整数的 String 对象。
 *         3.String类的静态方法valueOf(参数)
 *             static String valueOf(int i) 返回 int 参数的字符串表示形式。
 *     字符串(String)->基本类型
 *         使用包装类的静态方法parseXXX("字符串");
 *             Integer类: static int parseInt(String s)
 *             Double类: static double parseDouble(String s)
 * @version: 1.0
 */
public class Demo03Integer {
    public static void main(String[] args) {
        //基本数据类型->字符类型
        String s1 = "123";
        //123100
        System.out.println(s1 + 100);

        String string = Integer.toString(100);
        //100100
        System.out.println(string + 100);

        String s = String.valueOf(100);
        //100200
        System.out.println(s + 200);

        //字符类型->基本数据类型
        int i = Integer.parseInt("100");
        System.out.println(i);


    }

}
