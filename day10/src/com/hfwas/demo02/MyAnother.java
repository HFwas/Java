package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2020/12/31
 * @Description: 验证同一个包的权限修饰符的作用范围
 * 验证四种权限修饰符的作用范围
 * @version: 1.0
 */
public class MyAnother {

    public static void main(String[] args) {
        System.out.println(new MyClass().num1);
        System.out.println(new MyClass().num2);
        System.out.println(new MyClass().num3);

        //错误写法，不能访问private修饰的变量
//        System.out.println(new MyClass().num4);
    }

}
