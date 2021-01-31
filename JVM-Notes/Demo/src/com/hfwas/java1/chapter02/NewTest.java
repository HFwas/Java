package com.hfwas.java1.chapter02;

import java.io.File;

/**
 * @Author: HFwas
 * @Date: 2021/1/30
 * @Description: com.hfwas.java1.chapter02
 * 指令4：对象，数组的创建与访问指令
 * @version: 1.0
 */
public class NewTest {
    // 1.创建指令
    public void newInstance(){
        Object o = new Object();
        File file = new File("E:\\czxt\\安装说明（必看）.txt");
    }

    public void newArray(){
        int[] arr = new int[10];
        Object[] objects = new Object[10];
        int[][] ints = new int[10][10];
        String[][] strings = new String[10][];
    }

    // 2.字段访问指令
    public void sayHello(){
        System.out.println("hello");
    }

    public void setOrderId(){
        Order order = new Order();
        order.id = 100;
        System.out.println(order.id);

        Order.name = "Order";
        System.out.println(Order.name);

    }

    // 3.数组操作指令
    public void serArray(){
        int[] ints = new int[10];
        ints[3] = 10;
        System.out.println(ints[0]);

        boolean[] booleans = new boolean[10];
        booleans[0] = false;
    }

    public void arrLength(){
        double[] doubles = new double[10];
        System.out.println(doubles.length);
    }

    // 4.
    public String checkCast(Object o){
        if (o instanceof String) {
            return (String)o;
        }else {
            return null;
        }
    }
}

class  Order{
    int id;
    static String name;
}
