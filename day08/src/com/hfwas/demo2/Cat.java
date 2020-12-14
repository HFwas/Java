package com.hfwas.demo2;

/**
 * @Author: HFwas
 * @Date: 2020/12/14
 * @Description: com.hfwas.demo2
 * @version: 1.0
 */
public class Cat extends Animal{

    public Cat(){
        //super()
        System.out.println("子类构造方法执行");
    }

    @Override
    public void eat() {
        System.out.println("猫吃东西");
    }


}
