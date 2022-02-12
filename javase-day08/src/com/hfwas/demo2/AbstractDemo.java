package com.hfwas.demo2;

/**
 * @Author: HFwas
 * @Date: 2020/12/14
 * @Description:
 * 一个抽象类不一定含有抽象方法，只要保证抽象方法所在的类是抽象类，即可
 * 这样没有抽象方法的抽象类，也不能直接创建对象，在一些特殊场景下有用途
 *
 * @version: 1.0
 */
public class AbstractDemo {

    public static void main(String[] args) {
//        Animal animal = new Animal();//错误写法,不能直接

        Cat cat = new Cat();
        //抽象父类构造方法执行
        //子类构造方法执行
        //猫吃东西
        cat.eat();
    }

}
