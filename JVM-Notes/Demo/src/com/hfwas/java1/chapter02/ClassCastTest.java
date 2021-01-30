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

    @Test
    public void upCase2(){
        int i = 123123123;
        float f = i;
    }
}
