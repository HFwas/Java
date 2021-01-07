package com.hfwas.demo05;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo05
 * @version: 1.0
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        demo01(10, 20, new Calculator() {
            @Override
            public int cal(int a, int b) {
                return a + b;
            }
        });

        //使用匿名内部类
        demo01(10,200,(int a,int b)->{
            return a+b;
        });
    }

    /**
     * 计算机两值和，使用Calculator
     */
    private static void demo01(int a,int b,Calculator calculator) {
        int sum = calculator.cal(a,b);
        System.out.println(sum);
    }


}
