package com.hfwas.demo02;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author: HFwas
 * @Date: 2021/1/12
 * @Description: com.hfwas.demo02
 * Stream流中的常用方法_count:用于统计Stream流中元素的个数
 *     long count();
 *     count方法是一个终结方法,返回值是一个long类型的整数
 *     所以不能再继续调用Stream流中的其他方法了
 * @version: 1.0
 */
public class Demo05Stream_count {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        long count = stream.count();
        System.out.println(count);


        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        Stream<String> stream1 = list.stream();
        long count1 = stream1.count();
        System.out.println(count1);
    }
}
