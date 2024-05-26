package com.atguigu.demo;

import java.util.concurrent.atomic.AtomicReference;

class User{
    String userName;
    int age;
}
public class AtomicReferenceDemo {
    public static void main(String[] args){
        AtomicReference<User> atomicReference = new AtomicReference<>();

//        User z3 = new User("z3",22);
//        User li4 = new User("li4",25);

//        atomicReference.set(z3);
//        System.out.println(atomicReference.compareAndSet(z3,li4)+"\t"+atomicReference.get().toString());

    }
}
