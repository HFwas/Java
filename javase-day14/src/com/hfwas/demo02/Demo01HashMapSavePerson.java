package com.hfwas.demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: HFwas
 * @Date: 2021/1/4
 * @Description: com.hfwas.demo02
 * HashMap存储自定义类型键值
 *     Map集合保证key是唯一的:
 *         作为key的元素,必须重写hashCode方法和equals方法,以保证key唯一
 * @version: 1.0
 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }

    /**
     * HashMap存储自定义类型键值
     *         key:Person类型
     *             Person类就必须重写hashCode方法和equals方法,以保证key唯一
     *         value:String类型
     *             可以重复
     */
    private static void demo02() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("张三",18),"上海");
        map.put(new Person("李四",19),"深圳");
        map.put(new Person("王五",20),"苏州");
        map.put(new Person("张三",18),"广州");

        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }

    /**
     * HashMap存储自定义类型键值
     *         key:String类型
     *             String类重写hashCode方法和equals方法,可以保证key唯一
     *         value:Person类型
     *             value可以重复(同名同年龄的人视为同一个)
     */
    private static void demo01() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("上海",new Person("张三",18));
        map.put("苏州",new Person("李四",19));
        map.put("深圳",new Person("王五",20));
        map.put("上海",new Person("赵六",21));

        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
