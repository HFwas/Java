package com.hfwas.demo01;

/**
 * @Author: HFwas
 * @Date: 2020/12/30
 * @Description: com.hfwas.demo01
 * 学生类
 * @version: 1.0
 */
public class Student {

    public String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
