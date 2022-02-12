package com.hfwas.test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: HFwas
 * @Date: 2021/1/4
 * @Description: com.hfwas.test
 * 练习:
 *         计算一个字符串中每个字符出现次数
 *     分析:
 *         1.使用Scanner获取用户输入的字符串
 *         2.创建Map集合,key是字符串中的字符,value是字符的个数
 *         3.遍历字符串,获取每一个字符
 *         4.使用获取到的字符,去Map集合判断key是否存在
 *             key存在:
 *                 通过字符(key),获取value(字符个数)
 *                 value++
 *                 put(key,value)把新的value存储到Map集合中
 *             key不存在:
 *                 put(key,1)
 *         5.遍历Map集合,输出结果
 * @version: 1.0
 */
public class MapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //获取键盘输入的字符串
        String str = scanner.next();

        //将字符串按照字符存入map集合
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            //取出字符
            char c = str.charAt(i);
            //集合中是否存在字符，存在则value直接加一，不存在存入集合
            if (map.containsKey(c)) {
                Integer value = map.get(c);
//                value++;
//                map.put(c,value);

                map.put(c,++value);
            }else {
                map.put(c,1);
            }
        }

        Set<Character> set = map.keySet();
        for (Character key : set) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
