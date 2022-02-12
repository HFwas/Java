package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2020/12/31
 * @Description: 验证同一个类的权限修饰符的作用范围
 * @version: 1.0
 */
public class MyClass {

    public int num1 = 10;
    protected int num2 = 11;
    int num3 = 12;
    private int num4 = 13;

    public void method(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        System.out.println("方法执行了");
    }

}
