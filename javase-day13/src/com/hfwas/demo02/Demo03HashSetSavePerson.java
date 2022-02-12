package com.hfwas.demo02;

import java.util.HashSet;

/**
 * @Author: HFwas
 * @Date: 2021/1/3
 * @Description: com.hfwas.demo02
 * HashSet存储自定义类型元素
 *     set集合报错元素唯一:
 *         存储的元素(String,Integer,...Student,Person...),必须重写hashCode方法和equals方法
 *     要求:
 *         同名同年龄的人,视为同一个人,只能存储一次
 * @version: 1.0
 */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        //没有重写hashcode方法和requals方法
        HashSet<Person> set = new HashSet<>();
        Person person1 = new Person("张三1", 18);
        Person person2 = new Person("张三1", 18);
        Person person3 = new Person("张三1", 19);
        set.add(person1);
        set.add(person2);
        set.add(person3);

        //460141958
        System.out.println(person1.hashCode());
        //1163157884
        System.out.println(person2.hashCode());
        //1956725890
        System.out.println(person3.hashCode());

        //false
        System.out.println(person1 == person2);
        //false
        System.out.println(person1.equals(person2));

        //重写了toString方法
        //[Person{name='张三1', age=19}, Person{name='张三1', age=18}, Person{name='张三1', age=18}]
        System.out.println(set);

        System.out.println("===============");

        //重写了hashcode和equals方法之后
        //744670827
        System.out.println(person1.hashCode());
        //744670827
        System.out.println(person2.hashCode());
        //744670828
        System.out.println(person3.hashCode());

        //false
        System.out.println(person1 == person2);
        //true
        System.out.println(person1.equals(person2));

        //重写了toString方法
        //[Person{name='张三1', age=18}, Person{name='张三1', age=19}]
        System.out.println(set);

    }
}
