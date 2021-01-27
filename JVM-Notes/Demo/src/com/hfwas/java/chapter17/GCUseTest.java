package com.hfwas.java.chapter17;

import java.util.ArrayList;

/**
 * @Author: HFwas
 * @Date: 2021/1/27
 * @Description: com.hfwas.java.chapter17
 * -XX:+PrintCommandLineFlags
 * 查看默认的垃圾回收器
 * @version: 1.0
 */
public class GCUseTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        while (true) {
            byte[] bytes1 = new byte[100];
            list.add(bytes1);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
