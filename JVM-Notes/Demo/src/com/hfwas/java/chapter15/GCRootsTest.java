package com.hfwas.java.chapter15;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: HFwas
 * @Date: 2021/1/26
 * @Description: com.hfwas.java.chapter15
 * @version: 1.0
 */
public class GCRootsTest {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Date date = new Date();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("数据添加完毕，请操作：");

        new Scanner(System.in).next();
        list = null;
        date = null;

        System.out.println("list,date已置空，请操作");
        new Scanner(System.in).next();
        System.out.println("结束");
    }
}
