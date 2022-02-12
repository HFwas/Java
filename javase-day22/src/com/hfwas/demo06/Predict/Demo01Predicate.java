package com.hfwas.demo06.Predict;

import java.util.function.Predicate;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo06.Predict
 * java.util.function.Predicate<T>接口
 *     作用:对某种数据类型的数据进行判断,结果返回一个boolean值
 *
 *     Predicate接口中包含一个抽象方法：
 *         boolean test(T t):用来对指定数据类型数据进行判断的方法
 *             结果:
 *                 符合条件,返回true
 *                 不符合条件,返回false
 * @version: 1.0
 */
public class Demo01Predicate {
    public static void main(String[] args) {
        String str = "abcde";
        boolean bo = check(str, (String string) -> {
            return string.length() > 5;
        });

        System.out.println(bo);
    }

    /**
     * 使用Predicate中的方法test对字符串进行判断,并把判断的结果返回
     * @param str
     * @param predicate
     * @return
     */
    private static boolean check(String str, Predicate<String> predicate) {
        return predicate.test(str);
    }
}
