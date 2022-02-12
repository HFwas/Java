package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo02
 * 使用Lambda优化日志案例
 *     Lambda的特点:延迟加载
 *     Lambda的使用前提,必须存在函数式接口
 * @version: 1.0
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        String message1 = "heelo1";
        String message2 = "heelo2";
        String message3 = "heelo3";

        /**
         * 使用Lambda表达式作为参数传递,仅仅是把参数传递到demo01方法中
         *             只有满足条件,日志的等级是1级
         *                 才会调用接口MessageBuilder中的方法getMessage
         *                 才会进行字符串的拼接
         *             如果条件不满足,日志的等级不是1级
         *                 那么MessageBuilder接口中的方法getMessage也不会执行
         *                 所以拼接字符串的代码也不会执行
         *             所以不会存在性能的浪费
         */
        demo01(1,()->{
            return message1 + message2 + message3;
        });
    }

    private static void demo01(int level,MessageBuilder mb) {
        if (level == 1) {
            System.out.println(mb.getMessage());
        }
    }
}
