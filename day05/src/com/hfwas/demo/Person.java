package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/10
 * @Description: com.hfwas.demo
 * @version: 1.0
 */
public class Person {

    String name;
    private  int age;

    public void show(){
        System.out.println("我叫" + name + ",年龄" + age);
    }

    public void setAge(int num){
        if (num < 100 && num > 0) {
            age = num;
        }else {
            System.out.println("数据不合理");
        }
    }

    public int getAge(){
        return age;
    }

}
