package com.hfwas.demo02;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: HFwas
 * @Date: 2021/1/4
 * @Description: com.hfwas.demo02
 * java.util.LinkedHashMap<K,V> entends HashMap<K,V>
 *     Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
 *     底层原理:
 *         哈希表+链表(记录元素的顺序)
 * @version: 1.0
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("张三",18),"上海");
        map.put(new Person("李四",19),"深圳");
        map.put(new Person("王五",20),"苏州");
        map.put(new Person("张三",18),"广州");

        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            //Person{name='张三', age=18}=广州 Person{name='王五', age=20}=苏州 Person{name='李四', age=19}=深圳
            System.out.print(key + "=" + value + " ");
        }

        System.out.println();

        LinkedHashMap<Person, String> map1 = new LinkedHashMap<>();
        map1.put(new Person("张三",18),"上海");
        map1.put(new Person("李四",19),"深圳");
        map1.put(new Person("王五",20),"苏州");
        map1.put(new Person("张三",18),"广州");

        Set<Map.Entry<Person, String>> se = map1.entrySet();
        for (Map.Entry<Person, String> entry : se) {
            Person key = entry.getKey();
            String value = entry.getValue();
            //Person{name='张三', age=18}=广州 Person{name='李四', age=19}=深圳 Person{name='王五', age=20}=苏州
            System.out.print(key + "=" + value + " ");
        }
    }
}
