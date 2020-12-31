package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2020/12/31
 * @Description: com.hfwas.demo03
 *
 * @version: 1.0
 */
public class Demo02InnerClass {

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.innerMethod();
    }

}
