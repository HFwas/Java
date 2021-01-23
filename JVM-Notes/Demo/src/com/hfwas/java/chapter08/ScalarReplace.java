package com.hfwas.java.chapter08;

/**
 * @Author: HFwas
 * @Date: 2021/1/23
 * @Description: com.hfwas.java.chapter08
 * 标量替换测试
 * -Xmx100m -Xms100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:+EliminateAllocations
 * @version: 1.0
 */
public class ScalarReplace {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("耗费时间为：" + (end - start) + "毫秒");
    }

    public static class User{
        public int id;
        public String name;
    }

    public static void alloc(){
        //未发生逃逸
        User user = new User();
        user.id = 15;
        user.name = "hfwas";
    }
}
