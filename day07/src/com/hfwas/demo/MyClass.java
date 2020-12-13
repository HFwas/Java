package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/13
 * @Description: com.hfwas.demo
 * @version: 1.0
 */
public class MyClass {

    //成员变量
    int num;
    //静态变量
    static int staticNum;

    public void method(){
        System.out.println("这是一个普通的成功方法");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(staticNum);
    }

    //静态方法
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        //静态方法不可以访问成员变量
        //错误写法
//        System.out.println(num);
        //静态方法可以访问静态变量
        System.out.println(staticNum);

        //静态方法不可以使用this
//        System.out.println(this);
    }

}
