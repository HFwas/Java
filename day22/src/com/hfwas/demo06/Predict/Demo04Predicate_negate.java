package com.hfwas.demo06.Predict;

import java.util.function.Predicate;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo06.Predict
 * 需求:判断一个字符串长度是否大于5
 *         如果字符串的长度大于5,那返回false
 *         如果字符串的长度不大于5,那么返回true
 *     所以我们可以使用取反符号!对判断的结果进行取反
 *
 *     Predicate接口中有一个方法negate,也表示取反的意思
 *     default Predicate<T> negate() {
 *         return (t) -> !test(t);
 *     }
 * @version: 1.0
 */
public class Demo04Predicate_negate {
    /**
     *
     * 使用Predicate接口判断字符串的长度是否大于5
     * @param s
     * @param pre
     * @return
     */
    public static boolean checkString(String s, Predicate<String> pre){
        //return !pre.test(s);
        //等效于return !pre.test(s);
        return  pre.negate().test(s);
    }

    public static void main(String[] args) {
        //定义一个字符串
        String s = "abc";
        //调用checkString方法,参数传递字符串和Lambda表达式
        boolean b = checkString(s,(String str)->{
            //判断字符串的长度是否大于5,并返回结果
            return str.length()>5;
        });
        System.out.println(b);
    }
}
