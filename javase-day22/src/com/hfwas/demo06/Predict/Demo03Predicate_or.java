package com.hfwas.demo06.Predict;

import java.util.function.Predicate;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo06.Predict
 * 需求:判断一个字符串,有两个判断的条件
 *         1.判断字符串的长度是否大于5
 *         2.判断字符串中是否包含a
 *     满足一个条件即可,我们就可以使用||运算符连接两个条件
 *
 *     Predicate接口中有一个方法or,表示或者关系,也可以用于连接两个判断条件
 *     default Predicate<T> or(Predicate<? super T> other) {
 *         Objects.requireNonNull(other);
 *         return (t) -> test(t) || other.test(t);
 *     }
 *     方法内部的两个判断条件,也是使用||运算符连接起来的
 * @version: 1.0
 */
public class Demo03Predicate_or {
    public static void main(String[] args) {
        //false
        //String str = "dfhodifhdi";

        //true
        String str = "abcde";
        boolean boo = checkString(str, (s1) -> {
            //1.判断字符串的长度是否大于5
            return s1.length() > 5;
        }, (s2) -> {
            //2.判断字符串中是否包含a
            return s2.contains("a");
        });
        System.out.println(boo);
    }

    /**
     * 传递两个Predicate接口，两个只要满足一种即可
     * @param str
     * @param p1  用于判断字符串的长度是否大于5
     * @param p2  用于判断字符串中是否包含a
     */
    private static boolean checkString(String str, Predicate<String> p1, Predicate<String> p2) {
        //return p1.test(str) || p2.test(str);
        //两种写法是等价的
        return p1.or(p2).test(str);
    }
}
