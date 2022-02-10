package com.hfwas;

import com.sun.swing.internal.plaf.basic.resources.basic_es;

import java.util.Optional;

//单行注释
public class Main {
    /*
    多行注释
     */
    public static void main(String[] args) {
        //java第一个程序，hello,world
        System.out.println("hello world");
        Object dddd = Optional.ofNullable(null).orElse("dddd");
        User user = Optional.ofNullable(new User("ddd", "dddddd")).orElse(null);
        User use2 = Optional.ofNullable(new User()).orElse(null);
        User use3 = Optional.ofNullable(new User()).orElseGet(() -> new User("a", "a"));

        System.out.println(dddd);
        System.out.println(user);
        System.out.println(use2);
        System.out.println(use3);
    }


}

class User{
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return name + "===" + password;
    }
}
