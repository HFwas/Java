package com.hfwas.demo07;

import java.util.function.Function;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo07
 * 练习：自定义函数模型拼接
 *     题目
 *     请使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
 *         String str = "赵丽颖,20";
 *
 *     分析:
 *     1. 将字符串截取数字年龄部分，得到字符串；
 *         Function<String,String> "赵丽颖,20"->"20"
 *     2. 将上一步的字符串转换成为int类型的数字；
 *         Function<String,Integer> "20"->20
 *     3. 将上一步的int数字累加100，得到结果int数字。
 *         Function<Integer,Integer> 20->120
 * @version: 1.0
 */
public class Demo03Test {
    public static void main(String[] args) {
        String st = "赵丽颖,20";
        transfer(st, new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split(",")[1];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }, new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 100;
            }
        });
    }

    private static void transfer(String str, Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3) {
        Integer num = fun1.andThen(fun2).andThen(fun3).apply(str);
        System.out.println(num);
    }
}
