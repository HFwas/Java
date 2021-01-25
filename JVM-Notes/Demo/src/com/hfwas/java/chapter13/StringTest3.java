package com.hfwas.java.chapter13;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: HFwas
 * @Date: 2021/1/25
 * @Description: com.hfwas.java.chapter13
 * jdk6中:
 *      -XX:PermSize=6m -XX:MaxPermSize=6m -Xms6m -Xmx6m
 * jdR8中
 *      -XX:MetaspaceSize=6m -XX:MaxMetaspaceSize=6m -Xms6m -Xmx6m
 * @version: 1.0
 */
public class StringTest3 {
    public static void main(String[] args) {
        //使用set保持常量池引用，避免full gc回收常量池行为
        Set<String> set = new HashSet<>();
        //在short可以取值的范围内足以让6MB的PermSize或heap产生OOM
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
