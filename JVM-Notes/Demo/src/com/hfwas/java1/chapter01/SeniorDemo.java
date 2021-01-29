package com.hfwas.java1.chapter01;

/**
 * @Author: HFwas
 * @Date: 2021/1/29
 * @Description: com.hfwas.java1.chapter01
 * @version: 1.0
 */
public class SeniorDemo {
    private int num = 1;
    public final String str = "hfwas";
    boolean[] counts;

    public SeniorDemo() {
    }

    public SeniorDemo(int num) {
        this.counts =  new boolean[num];
    }

    public String getStr() {
        return str;
    }

    public void addNum(int x){
        num += x;
        System.out.println(num);
    }
}
