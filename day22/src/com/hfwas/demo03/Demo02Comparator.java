package com.hfwas.demo03;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo03
 * @version: 1.0
 */
public class Demo02Comparator {
    public static void main(String[] args) {
        String[] str = {"aa","b","cccc","ddd"};
        //[aa, b, cccc, ddd]
        System.out.println(Arrays.toString(str));

        Arrays.sort(str,com());
        //[cccc, ddd, aa, b]
        System.out.println(Arrays.toString(str));

    }

    private static Comparator<String> com() {
        //方法的返回值类型是一个接口,那么我们可以返回这个接口的匿名内部类
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照降序的规则进行排序
                return o2.length() - o1.length();
            }
        };

        //使用lambda表达式
        /*return (String o1, String o2)->{
            return o2.length() - o1.length();
        };*/

        //简化lambda表达式
        /*return (o1,o2)->return o2.length() - o1.length();*/
    }
}
