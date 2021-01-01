package com.hfwas.demo01;

import java.util.Objects;

/**
 * @Author: HFwas
 * @Date: 2021/1/1
 * @Description: com.hfwas.demo01
 * @version: 1.0
 */
public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 问题：隐含着一个多态，Object ovj = p2 = new Person("张三1", 15);
     *      多态的弊端：无法使用子类特有的内容(属性，方法)
     * 解决：可以使用向下转型(强转)，吧object类型转换为person
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        //传进来的参数是o对象本身
        if (this == o) return true;
        //如果传进来的o对象是null，
        //使用了反射技术，判断o是否是Person对象
        if (o == null || getClass() != o.getClass()) return false;
        //使用向下转型(强转)，吧object类型转换为person
        Person person = (Person) o;
        //比较两个对象的属性
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    /**
     * 重写toSting()方法
     * @return
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
