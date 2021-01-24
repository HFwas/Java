package com.hfwas.java.chapter09;

/**
 * @Author: HFwas
 * @Date: 2021/1/24
 * @Description: com.hfwas.java.chapter09
 * 《深入理解av虚拟机》中的案例：
 * staticObj、 instanceObj、 LocalObj存放在哪里？
 * @version: 1.0
 */
public class StaticObjTest {
    static class Test {
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();

        void foo(){
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");
        }
    }

    private static class ObjectHolder{

    }

    public static void main(String[] args) {

    }
}
