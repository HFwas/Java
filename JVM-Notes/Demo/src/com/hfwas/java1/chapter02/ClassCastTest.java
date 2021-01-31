package com.hfwas.java1.chapter02;

import org.junit.Test;

/**
 * @Author: HFwas
 * @Date: 2021/1/30
 * @Description: com.hfwas.java1.chapter02
 * 指令3：类型转换指令
 * @version: 1.0
 */
public class ClassCastTest {

    // 宽化类型转换

    // 指针宽化类型转换的基本测试
    public void upCast1(){
        int i = 10;
        long l = i;
        float f = i;
        double d = i;

        float f1 = l;
        double d1 = l;
        double d2 = l;
    }

    // 举例：精度损失的问题
    @Test
    public void upCase2(){
        int i = 123123123;
        float f = i;
        // 1.2312312E8
        //发生了精度损失
        System.out.println(f);

        long l = 123123123123L;
        l = 123123123123123123L;
        double d = l;
        // 1.2312312312312312E17
        System.out.println(d);
    }

    // 针对byte,short等转换为容量大的类型时，将此类型看作int类型处理
    public void upCast3(byte b){
        int i = b;
        long l = b;
        double d = b;
    }

    public void upCast4(short s){
        int i = s;
        long l = s;
        double d = s;
        float f = s;
    }

    // 窄化类型转换
    // 基本的使用
    public void downCast1(){
       int i = 10;
       byte b = (byte) i;
       short s = (short)i;
       char c = (char)i;

       long l = 10L;
       int i1 = (int)l;
       byte b1 = (byte)l;
    }

    public void downCast2(){
        float f = 10;
        long l = (long)f;
        int i = (int)f;
        byte b = (byte)f;

        double d = 10;
        byte b1 = (byte)d;
    }

    public void downCast3(){
        short s = 10;
        byte b = (byte)s;
    }

    // 窄化类型转换的精度损失
    @Test
    public void downCast4(){
        int i = 128;
        byte b = (byte)i;
        System.out.println(b);
    }

    // 测试NAN,无穷大的情况
    @Test
    public void downCast5(){
        double d1 = Double.NaN;
        int i = (int)d1;
        System.out.println(i);

        double d2 = Double.POSITIVE_INFINITY;
        long l = (long)d2;
        int j = (int)d2;
        System.out.println(l);
        System.out.println(j);

        float f = (float) d1;
        System.out.println(f);
    }
}
