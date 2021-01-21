package com.hfwas.java.chapter05;

import java.util.Date;

/**
 * @Author: HFwas
 * @Date: 2021/1/21
 * @Description: com.hfwas.java.chapter05
 * @version: 1.0
 */
public class LocalVariablesTest {
    private int count = 0;
    public static void main(String[] args) {
        LocalVariablesTest lvt = new LocalVariablesTest();
        int num = 10;
        lvt.demo01();
    }

    //关于Slot的使用理解
    public LocalVariablesTest(){
        this.count = 1;
    }

    //练习
    public static void testStatic(){
        LocalVariablesTest test = new LocalVariablesTest();
        Date date = new Date();
        int count = 12;
        System.out.println(count);

        //因为this变量不存在于当前方法的局部变量表中
        //System.out.println(this.count);
    }

    //
    private void demo01() {
        Date date = new Date();
        String name = "com.hfwas";
        String info = demo02(date,name);
        System.out.println(date + name);
    }

    private String demo02(Date date,String name) {
        date = null;
        name = "helloworld";
        //占据两个slot
        double weight = 10.5;
        char gender = '男';
        return date + name;
    }

    private void demo03(){
        count++;
    }

    private void demo04(){
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        //变量c使用之前已经销毁的变量b占据的slot的位置
        int c = a + 1;
    }
}
