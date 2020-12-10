package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/10
 * @Description: 定义一个类，用来模拟"学生"事务，其中有两个组成部分
 * 属性（是什么）：
 *      姓名
 *      年龄
 * 行为（能做什么）：
 *      吃饭，睡觉，学习
 * @version: 1.0
 */
public class Student {

    //成员变量
    String name; //姓名
    int age; //年龄

    //成员方法
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void study(){
        System.out.println("学习");
    }
}
