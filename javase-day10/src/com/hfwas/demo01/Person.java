package com.hfwas.demo01;

/**
 * @Author: HFwas
 * @Date: 2020/12/30
 * @Description: com.hfwas.demo01
 * 对于成员变量来说，如果使用了final关键字修饰，那么这个变量也照样是不可变的
 *      1.由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值了
 *      2.对于final的成员变量，要么通过构造方法赋值。二者选其一
 *      3.必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值
 * @version: 1.0
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
