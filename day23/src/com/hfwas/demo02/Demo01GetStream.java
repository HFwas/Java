package com.hfwas.demo02;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo2
 * java.util.stream.Stream<T>是Java 8新加入的最常用的流接口。（这并不是一个函数式接口。）
 *     获取一个流非常简单，有以下几种常用的方式：
 *         - 所有的Collection集合都可以通过stream默认方法获取流；
 *             default Stream<E> stream​()
 *         - Stream接口的静态方法of可以获取数组对应的流。
 *             static <T> Stream<T> of​(T... values)
 *             参数是一个可变参数,那么我们就可以传递一个数组
 * @version: 1.0
 */
public class Demo01GetStream {
    public static void main(String[] args) {
        //把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        HashSet<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        HashMap<String, String> map = new HashMap<>();
        Set<String> set1 = map.keySet();
        Stream<String> stream2 = set1.stream();

        //获取值,存储到一个Collection集合中
        Collection<String> coll = map.values();
        Stream<String> stream3 = coll.stream();

        //获取键值对(键与值的映射关系 entrySet)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();

        //把数组转换为Stream流
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4);

        //可变参数可以传递数组
        int[] arr = {1,2,3,4};
        Stream<int[]> arr1 = Stream.of(arr);
        String[] str = {"a","b","c","d"};
        Stream<String> str1 = Stream.of(str);

    }
}
