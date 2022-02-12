package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/8
 * @Description: 方法练习
 * @version: 1.0
 */
public class MethodPractise {

    public static void main(String[] args) {
        //System.out.println(isSame(12,12,));
        //System.out.println(isSame(12,25));

        //System.out.println(getSum());

        print(10);
    }

    //判断两个数字是否相同
    public  static  boolean isSame(int a,int b){
//        boolean same = a == b;
        return a == b;
    }

    //求出1-100累加和
    public static int getSum(){
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        return result;
    }

    //打印指定次数的hello world
    public static void print(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("hello world" + i);
        }
    }

}
