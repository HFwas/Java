package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo02
 * 使用递归计算1~~n之间的和
 * @version: 1.0
 */
public class Demo02Recurison {
    public static void main(String[] args) {
        int sum = sum(10);
        //55
        System.out.println(sum);
    }

    private static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
