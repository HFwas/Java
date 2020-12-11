package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/11
 * @Description: 匿名对象
 * @version: 1.0
 */
public class Person {

    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void showName(){
        System.out.println("这是我的名字" + name);
    }

}
