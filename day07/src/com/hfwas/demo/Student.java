package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/13
 * @Description: com.hfwas.demo
 * @version: 1.0
 */
public class Student {

    //学号
    private int id;
    //姓名
    private String name;
    //年龄
    private int age;
    static String room;
    //学号计数器，每当新new一个对象，计数器就自增其++
    private static int idCounter = 0;

    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
