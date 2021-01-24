package com.hfwas.java.chapter09;

/**
 * @Author: HFwas
 * @Date: 2021/1/24
 * @Description: com.hfwas.java.chapter09
 * mon-final的类变量
 * @version: 1.0
 */
public class MethodAreaTest {
    public static void main(String[] args) {
       Order order = null;
       //hello hfwas
       order.hello();
       //1
       System.out.println(order.count);
    }
}

class Order{
    public static int count = 1;
    public static final int number = 2;

    public static void hello(){
        System.out.println("hello hfwas");
    }
}
