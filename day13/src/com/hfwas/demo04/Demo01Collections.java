package com.hfwas.demo04;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: HFwas
 * @Date: 2021/1/3
 * @Description: com.hfwas.demo04
 * - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
 *         - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
 *         - public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
 * @version: 1.0
 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,2,3,6,4,5);
        //[1, 2, 3, 6, 4, 5]
        System.out.println(list);

        Collections.shuffle(list);
        //[2, 1, 4, 5, 6, 3]
        System.out.println(list);
    }
}
