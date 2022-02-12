package com.hfwas.demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author: HFwas
 * @Date: 2021/1/1
 * @Description: com.hfwas.demo01
 * java.lang.Object类，类Object是类层次结构的根类，每个类都使用Object作为超父类
 * 所有对象都是实现这个类的方法
 * @version: 1.0
 */
public class Demo01ToString {

    public static void main(String[] args) {
        Person person = new Person("张三", 18);
        System.out.println(person.toString());

        //直接打印d对象的名字，其实就是调用对象的toString()方法，
        //Person{name='张三', age=18}
        //重写了toString方法
        System.out.println(person);

        /**
         * 看一类个是否重写了toString方法，直接打印这个类对应的对象的名字即可
         * 如果没有重写方法，那么直接打印地址值
         * 如果重写了方法，那么按照重写的方法规定的格式打印即可
         */
        Random random = new Random();
        //java.util.Random@4554617c
        //没有重写toString方法
        System.out.println(random);

        Scanner scanner = new Scanner(System.in);
        //java.util.Scanner[delimiters=\p{javaWhitesp.....
        //没有重写toString方法
        System.out.println(scanner);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        //[1, 2] 重写了tostring方法
        System.out.println(list);
    }

}
