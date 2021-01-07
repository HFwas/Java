package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo02
 * 求n的阶乘
 * @version: 1.0
 */
public class Demo03Recurison {
    public static void main(String[] args) {
        int num = jieCheng(4);
        System.out.println(num);
    }

    private static int jieCheng(int n) {
        if (n == 1) {
            return 1;
        }
        return n*jieCheng(n - 1);
    }
}
