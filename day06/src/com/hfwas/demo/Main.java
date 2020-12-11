package com.hfwas.demo;

import java.util.Scanner;//1.导包

/**
 *  常用API
 *      Scanner类的功能：可以实现键盘输入数据，到程序当中
 *  创建对象的标准格式：
 *      类名称 对象名 = new 类名称();
 *  匿名对象：只有右边的对象，而没有左边的名字
 *      格式：new 名称();
 *      注意事项：匿名对象只能使用唯一的一次，下次在用不得不再创建一个新对象
 *      使用建议：如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象
 */
public class Main {

    public static void main(String[] args) {
        //2.创建
        //备注：System.in代表从键盘进行输入
        Scanner sc = new Scanner(System.in);

        //3.获取键盘输入的int数字
        int i = sc.nextInt();
        System.out.println("输入的数字时：" + i);

        //获取键盘输入的字符串
        String next = sc.next();
        System.out.println("输入的字符串是：" + next);

        //题目：键盘输入两个int数字，并且求出和值
        int one = sc.nextInt();
        int two = sc.nextInt();
        int result = one + two;
        System.out.println("两个数字和结果是：" + result);

        //题目：键盘输入三个int数字，求出最大值
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        int tmp = (i1 > i2) ? i1 : i2;
//        int max = (tmp > i3) ? tmp : i3;
        System.out.println("最大值是：" + ((tmp > i3) ? tmp : i3));

        //匿名对象
        Person person = new Person();
        person.name = "赵刚";
        person.showName();

        new Person().name = "Hello";
        new Person().showName();//null

    }












}
