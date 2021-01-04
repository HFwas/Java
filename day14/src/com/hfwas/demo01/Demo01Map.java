package com.hfwas.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HFwas
 * @Date: 2021/1/3
 * @Description: com.hfwas.demo01
 * java.util.Map<k,v>集合
 *     Map集合的特点:
 *         1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
 *         2.Map集合中的元素,key和value的数据类型可以相同,也可以不同
 *         3.Map集合中的元素,key是不允许重复的,value是可以重复的
 *         4.Map集合中的元素,key和value是一一对应
 *     java.util.HashMap<k,v>集合 implements Map<k,v>接口
 *     HashMap集合的特点:
 *         1.HashMap集合底层是哈希表:查询的速度特别的快
 *             JDK1.8之前:数组+单向链表
 *             JDK1.8之后:数组+单向链表|红黑树(链表的长度超过8):提高查询的速度
 *         2.hashMap集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致
 *    java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
 *    LinkedHashMap的特点:
 *         1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
 *         2.LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的
 * @version: 1.0
 */
public class Demo01Map {
    public static void main(String[] args) {
        //demo01();
        //demo02();
        demo03();
    }

    /**
     * map集合方法使用
     * public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
     * boolean containsKey(Object key)判断集合中是否包含指定的键。
     */
    private static void demo03() {
        Map<String, String> map = new HashMap<>();
        map.put("a","A");
        map.put("b","B");
        map.put("c","C");
        map.put("d","D");
        map.put("e","E");

        //{a=A, b=B, c=C, d=D, e=E}
        System.out.println(map);

        //A
        System.out.println(map.get("a"));
        //D
        System.out.println(map.get("d"));

        //true
        System.out.println(map.containsKey("a"));

        //true
        System.out.println(map.containsValue("A"));
    }

    /**
     * public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
     */
    private static void demo02() {
        Map<String, String> map = new HashMap<>();
        map.put("a","A");
        map.put("b","B");
        map.put("c","C");
        map.put("d","D");
        map.put("e","E");
        //{a=A, b=B, c=C, d=D, e=E}
        System.out.println(map);

        String a = map.remove("a");
        //A
        System.out.println(a);

        //{b=B, c=C, d=D, e=E}
        System.out.println(map);
    }

    /**
     * `public V put(K key, V value)`:  把指定的键与指定的值添加到Map集合中。
     */
    private static void demo01() {
        Map<String, String> map = new HashMap<>();
        String s = map.put("杨过", "小龙女");
        //null
        System.out.println(s);

        map.put("尹志平","小龙女");
        map.put("胡歌","AA");

        String put = map.put("A", "A");
        //null
        System.out.println(put);
        String put1 = map.put("A", "B");
        //A
        System.out.println(put1);
        //{A=B, 杨过=小龙女, 尹志平=小龙女, 胡歌=AA}
        System.out.println(map);
    }
}
