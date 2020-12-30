package com.hfwas.demo01;

/**
 * final关键字戴白哦最终的，不可改变的
 * 常见四种用法：
 *      1.可以用来修饰一个类
 *      2.可以用来修饰一个方法
 *      3.可以用来修饰一个局部变量
 *      4.可以用来修饰一个成员变量
 */
public class Main {

    public static void main(String[] args) {
	    // write your code here
        int num1 = 10;
        //10
        System.out.println(num1);

        num1 = 20;
        //20
        System.out.println(num1);

        //一旦使用了final用来修饰局部变量，那么这个变量就不能进行更改
        //“一次赋值，终生不变”
        final int num2 = 20;
        //20
        System.out.println(num2);

        final int num3 = 200;
        //200
        System.out.println(num3);

        //错误写法
//        num3 = 200;

        final int num4;
        num4 = 100;
        //正确写法，只要保证一次赋值即可
        //100
        System.out.println(num4);

        //对于基本数据类型来说，不可变说的是变量当中的数据不可改变
        //对于引用数据类型来说，不可变的是变量当中的地址值不可改变
        Student student = new Student("赵丽颖");
        //赵丽颖
        System.out.println(student.getName());
        //com.hfwas.demo01.Student@1b6d3586
        System.out.println(student);
        student = new Student("霍建华");
        //com.hfwas.demo01.Student@4554617c
        System.out.println(student);
        //霍建华
        System.out.println(student.getName());

    }
}
