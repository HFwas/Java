package com.hfwas.demo02;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @Author: HFwas
 * @Date: 2021/1/3
 * @Description: com.hfwas.demo02
 * java.util.LinkedHashSet集合 extends HashSet集合
 *     LinkedHashSet集合特点:
 *         底层是一个哈希表(数组+链表/红黑树)+链表:多了一条链表(记录元素的存储顺序),保证元素有序
 * @version: 1.0
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("ad");
        set.add("cc");
        set.add("dhjof");
        //无序也不重复
        //[cc, ad, www, dhjof]
        System.out.println(set);

        LinkedHashSet<String> linkedHash = new LinkedHashSet<>();
        linkedHash.add("www");
        linkedHash.add("ad");
        linkedHash.add("cc");
        linkedHash.add("dhjof");
        //有序但是不重复
        //[www, ad, cc, dhjof]
        System.out.println(linkedHash);
    }
}
