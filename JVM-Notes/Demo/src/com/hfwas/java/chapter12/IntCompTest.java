package com.hfwas.java.chapter12;

import java.awt.*;

/**
 * @Author: HFwas
 * @Date: 2021/1/25
 * @Description: com.hfwas.java.chapter12
 * 测试解释器模式和JIT编译模式
 * -Xint
 * -Xcomp
 * -Xmixed
 * @version: 1.0
 */
public class IntCompTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        //-Xint:花费时间为：6605ms
        //-Xcomp:花费时间为：1250ms
        //-Xmixed:花费时间为：1345ms
        testPrimeNumber(1000000);

        long end = System.currentTimeMillis();
        System.out.println("花费时间为：" + (end - start));
    }

    private static void testPrimeNumber(int i) {
        for (int j = 0; j < i; j++) {
            //计算100以内的质数
            label:for (int k = 2; k <= 100; k++) {
                for (int l = 2; l <= Math.sqrt(k); l++) {
                    if (k % l == 0) {
                        continue label;
                    }
                }
                //System.out.println(k);
            }
        }
    }
}
