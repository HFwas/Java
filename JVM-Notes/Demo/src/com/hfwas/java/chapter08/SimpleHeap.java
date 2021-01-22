package com.hfwas.java.chapter08;

/**
 * @Author: HFwas
 * @Date: 2021/1/22
 * @Description: com.hfwas.java.chapter08
 * @version: 1.0
 */
public class SimpleHeap {
    private int id;

    public SimpleHeap(int id) {
        this.id = id;
    }

    public void show(){
        System.out.println("id is = " + id);
    }

    public static void main(String[] args) {
        SimpleHeap sh1 = new SimpleHeap(1);
        SimpleHeap sh2 = new SimpleHeap(1);

        int[] arr = new int[10];

        Object[] objects = new Object[10];
    }
}
