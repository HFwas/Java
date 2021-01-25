package com.hfwas.java.chapter13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/1/25
 * @Description: com.hfwas.java.chapter13
 * -XX:StringTablesize
 * @version: 1.0
 */
public class StringTest2 {
    public static void main(String[] args) {
        //测试-XX:StringTablesize
//        System.out.println("开始");
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("1.txt"));
            long start = System.currentTimeMillis();
            String read;
            while ((read = br.readLine()) != null) {
                //如果字符串常量池中没有对应data的字符串的话，则在常量池中生成
                read.intern();
            }

            long end = System.currentTimeMillis();
            //1009:花费的时间为：12563
            //100009:花费的时间为：535
            System.out.println("花费的时间为：" + (end - start));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
