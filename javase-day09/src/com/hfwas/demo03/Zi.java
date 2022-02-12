package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2020/12/29
 * @Description: com.hfwas.demo03
 * @version: 1.0
 */
public class Zi extends Fu{

    int num = 20;

    int age = 16;

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void methodZi(){
        System.out.println("子类特有方法");
    }

    @Override
    public void showNum() {
        System.out.println(num);
    }
}
