package com.hfwas.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HFwas
 * @Date: 2020/12/31
 * @Description: com.hfwas.demo07
 * @version: 1.0
 */
public class DemoInterface {

    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这就是多态的写法
        List<String> list = new ArrayList<>();
        List<String> list1 = add(list);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }

    public static List<String> add(List<String> list){
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        return list;
    }

}
