package com.hfwas.demo04;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo04
 * @version: 1.0
 */
public class Demo01Cook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("做饭");
            }
        });

        //使用lambda表达式
        invokeCook(()->{
            System.out.println("该做饭了");
        });
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }


}
