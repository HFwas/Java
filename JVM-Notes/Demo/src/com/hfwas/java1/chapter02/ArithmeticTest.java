package com.hfwas.java1.chapter02;

import org.junit.Test;

/**
 * @Author: HFwas
 * @Date: 2021/1/30
 * @Description: com.hfwas.java1.chapter02
 * 指令2：算术指令
 * @version: 1.0
 */
public class ArithmeticTest {

    @Test
    public void method01(){
        int i = 10;
        double j = i / 0.0;
        // Infinity
        System.out.println(j);

        double d1 = 0.0;
        double d2 = d1 / 0.0;
        // NaN:not a number
        System.out.println(d2);
    }

    public void method02(){
        float f = 10;
        float f2 = -f;
        f = -f2;
    }

    public void method03(int j){
        int i = 100;
        i = i + 10;
        i += 10;
    }

    public int method04(int j){
        int a = 10;
        int b = 20;
        int c = 30;
        return (a + b) * c;
    }

    public int method05(int i,int j){
        return (i + j - 1) & ~(j - 1);
    }

    public void method06(){
        int i = 10;
        //i++;
        ++i;
    }

    public void method07(){
        int i = 10;
        int a = i++;

        int j = 20;
        int b = ++j;
    }

    public void method08(){
        int num = 10;
        num = num++;
        System.out.println(num);
    }
}
