package com.hfwas.java.chapter05;

/**
 * @Author: HFwas
 * @Date: 2021/1/21
 * @Description: com.hfwas.java.chapter05
 * @version: 1.0
 */
public class OperandStackTest {
    public static void main(String[] args) {

    }

    private void demo01() {
        //byte,short,char,boolean:都以int型来保存
        byte a = 12;
        int b = 10;
        int k = a + b;

        int m = 500;
    }

    public int add(){
        int a = 10;
        int b = 20;
        int k = a + b;
        return k;
    }

    public void testAdd(){
        //获取上一个栈帧返回的结果，并保存在操作数栈中
        int add = add();
        int j = 10;
    }

    /**
     * 面试当中：i++和++i的区别？
     */
    public void add2(){
        //第一类问题
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;

        //第二类问题
        int i3 = 10;
        int i4 = i3++;

        //第三类问题

        //第四类问题

    }
}
