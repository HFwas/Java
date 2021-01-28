package com.hfwas.java1.chapter01;

/**
 * @Author: HFwas
 * @Date: 2021/1/28
 * @Description: com.hfwas.java1.chapter01
 * @version: 1.0
 */
public class SonTest {
    public static void main(String[] args) {
        Father father = new Son();
        System.out.println(father.x);
    }
}

class Son extends Father{
    int x = 30;
    public Son() {
        this.print();
        x = 40;
    }

    public void print(){
        System.out.println("Son.x = " + x);
    }

}

class Father{
    int x = 10;

    public Father() {
        this.print();
        x = 20;
    }

    public void print(){
        System.out.println("Father.x = " + x);
    }
}
