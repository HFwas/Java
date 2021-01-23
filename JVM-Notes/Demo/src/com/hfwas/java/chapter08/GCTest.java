package com.hfwas.java.chapter08;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HFwas
 * @Date: 2021/1/23
 * @Description: com.hfwas.java.chapter08
 * 测试Minor GC，MajorGC、Full GC
 * @version: 1.0
 */
public class GCTest {
    public static void main(String[] args) {
        int  i = 0;

        try {
            List<String> list = new ArrayList<>();
            String str = "hfwas";
            while (true) {
                list.add(str);
                str = str + str;
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("遍历次数为：" + i);
        }


    }
}
