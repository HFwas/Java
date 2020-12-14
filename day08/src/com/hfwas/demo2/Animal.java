package com.hfwas.demo2;

/**
 * @Author: HFwas
 * @Date: 2020/12/14
 * @Description: 抽象类
 * 抽象方法：就是加上abstract关键字，然后去掉大括号，直接分号结束
 * 抽象类：抽象方法所在的类，必须是抽象类才行。在class之前写上abstract即可
 *
 * 如何使用抽象类和抽象方法：
 *      1.不能直接创建new抽象类对象
 *      2.必须用一个子类来继承抽象父类
 *      3.子类必须覆盖重写抽象父类当中所有的抽象方法
 * 覆盖重写(实现):子类去掉抽象方法的abstract关键字，然后补上方法体大括号
 * @version: 1.0
 */
public abstract class Animal {

    public Animal(){
        System.out.println("抽象父类构造方法执行");
    }

    public abstract void eat();

    //这是一个普通的成员方法
//    public void normalMethod(){
//        System.out.println();
//    }

}
