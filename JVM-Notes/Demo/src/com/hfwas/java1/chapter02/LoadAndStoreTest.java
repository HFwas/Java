package com.hfwas.java1.chapter02;

import java.util.Date;

/**
 * @Author: HFwas
 * @Date: 2021/1/30
 * @Description: com.hfwas.java1.chapter02
 * 指令1：加载与存储指令
 * @version: 1.0
 */
public class LoadAndStoreTest {
    //1.局部变量压栈指令
    public void load(int num,Object obj,long count,boolean flag,short[] arr){
        System.out.println(num);
        System.out.println(obj);
        System.out.println(count);
        System.out.println(flag);
        System.out.println(arr);
    }

    //2.常量入栈指令
    public void pushConstLdc(){
        int i = -1;
        int a = 5;
        int b = 6;
        int c = 127;
        int d = 128;
        int e = 1234567;
    }

    public void constLdc(){
        long num1 = 1;
        long num2 = 2;
        float num3 = 2;
        float num4 = 3;
        double num5 = 1;
        double num6 = 2;
        Date d = null;
    }

    // 3.出栈装入局部变量表中
    public void store(int k,double d){
        int m = k + 2;
        long l = 12;
        String str = "hello";
        float f = 10.0f;
        d = 10;
    }

    public void foo(long l,float f){
        {
            int i = 0;
        }
    }
}
