package com.hfwas.demo01;

import java.util.Random;

/**
 * @Author: HFwas
 * @Date: 2021/1/1
 * @Description: com.hfwas.demo01
 * Person类默认继承了Object类,所以可以使用Object类的equals方法
 *             boolean equals(Object obj) 指示其他某个对象是否与此对象“相等”。
 *             equals方法源码:
 *                 public boolean equals(Object obj) {
 *                     return (this == obj);
 *                 }
 *                 参数:
 *                     Object obj:可以传递任意的对象
 *                     == 比较运算符,返回的是一个布尔值 true false
 *                     基本数据类型:比较的是值
 *                     引用数据类型:比价的是两个对象的地址值
 *                this是谁?那个对象调用的方法,方法中的this就是那个对象;p1调用的equals方法所以this就是p1
 *                obj是谁?传递过来的参数p2
 *                this==obj -->person1==person2
 * @version: 1.0
 */
public class Demo02Equals {

    public static void main(String[] args) {

        Person person1 = new Person("张三1", 15);
        Person person2 = new Person("张三2", 25);
//        person1 = person2;

        //com.hfwas.demo01.Person@1b6d3586
        System.out.println(person1);
        //com.hfwas.demo01.Person@4554617c
        System.out.println(person2);
        boolean equals1 = person1.equals(person2);
        //false
        System.out.println(equals1);

        //如果参数是自己，自己比较自己
        //true
        System.out.println(person1.equals(person1));

        Random random = new Random();
        boolean equals = person1.equals(random);
        //false
        System.out.println(equals);

        //传进去的对象为Null
        //false
        System.out.println(person1.equals(null));
    }

}
