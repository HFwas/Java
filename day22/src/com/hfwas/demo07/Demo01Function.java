package com.hfwas.demo07;

import java.util.function.Function;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo07
 * java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，
 *         前者称为前置条件，后者称为后置条件。
 *     Function接口中最主要的抽象方法为：R apply(T t)，根据类型T的参数获取类型R的结果。
 *         使用的场景例如：将String类型转换为Integer类型。
 * @version: 1.0
 */
public class Demo01Function {
    public static void main(String[] args) {
        String str = "1234";
        transfer(str, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });
    }

    /**
     * 使用Function接口中的方法apply,把字符串类型的整数,转换为Integer类型的整数
     * @param str
     * @param function
     */
    private static void transfer(String str, Function<String,Integer> function) {
        Integer num = function.apply(str);
        System.out.println(num);
    }
}
