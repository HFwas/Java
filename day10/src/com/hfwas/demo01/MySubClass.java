package com.hfwas.demo01;

//错误写法，不能继承一个final类
public class MySubClass /*extends  MyClass*/{

    public void method(){
        System.out.println("子类方法执行");
    }

}
