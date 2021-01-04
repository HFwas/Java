package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2021/1/4
 * @Description: com.hfwas.demo03
 * finally中有return的情况
 * @version: 1.0
 */
public class Demo02Return {
    public static void main(String[] args) {
        int num = demo01();
        //300
        System.out.println(num);
    }

    private static int demo01() {
        int num = 10;
        try {
            return num;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            num = 300;
            return num;
        }
    }
}
