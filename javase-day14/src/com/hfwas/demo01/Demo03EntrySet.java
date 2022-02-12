package com.hfwas.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: HFwas
 * @Date: 2021/1/3
 * @Description: com.hfwas.demo01
 * Map集合遍历的第二种方式:使用Entry对象遍历
 *     Map集合中的方法:
 *         Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。
 *     实现步骤:
 *         1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
 *         2.遍历Set集合,获取每一个Entry对象
 *         3.使用Entry对象中的方法getKey()和getValue()获取键与值
 * @version: 1.0
 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");
        map.put("d", "D");
        map.put("e", "E");

        Set<Map.Entry<String, String>> set = map.entrySet();

        //遍历方法一
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> node = iterator.next();
            String key = node.getKey();
            String value = node.getValue();
            //key=a,value=A key=b,value=B key=c,value=C key=d,value=D key=e,value=E
            System.out.print("key=" + key + ",value=" + value + " ");
        }

        System.out.println();

        //遍历方法二
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            //key=a,value=A key=b,value=B key=c,value=C key=d,value=D key=e,value=E
            System.out.print("key=" + key + ",value=" + value + " ");
        }
    }
}
