package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/14
 * @Description: com.hfwas.demo
 * @version: 1.0
 */
public class Son extends Father{

    int numZi = 20;

    int num = 30;

    public void methodZi(){
        int num = 400;
        //因为本类当中有Num，所以这里使用的时本类的num
        System.out.println(num);//局部变量
        //30 本类的成员变量
        System.out.println(this.num);
        //父类的成员变量  20
        System.out.println(super.num);
    }
}
