package com.hfwas.demo01;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        String str1 = "abc";
        //abc
        System.out.println(str1);

        Person person = new Person("123", 25);
        //com.hfwas.demo01.Person@1b6d3586
        System.out.println(person);
        //没有重写toString方法，com.hfwas.demo01.Person@1b6d3586
        //重写了toString方法，Person{name='123', age=25}
        System.out.println(person.toString());
    }
}
