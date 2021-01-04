package com.hfwas.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: HFwas
 * @Date: 2021/1/3
 * @Description: com.hfwas.demo01
 * Map集合的第一种遍历方式:通过键找值的方式
 *     Map集合中的方法:
 *          Set<K> keySet() 返回此映射中包含的键的 Set 视图。
 *     实现步骤:
 *         1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
 *         2.遍历set集合,获取Map集合中的每一个key
 *         3.通过Map集合中的方法get(key),通过key找到value
 * @version: 1.0
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");
        map.put("d", "D");
        map.put("e", "E");

        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            //a=A b=B c=C d=D e=E
            System.out.print(key + "=" + value + " ");
        }

        System.out.println();

        //增强for循环
        for (String key : set) {
            String value = map.get(key);
            //a=A b=B c=C d=D e=E
            System.out.print(key + "=" + value + " ");
        }
    }
}