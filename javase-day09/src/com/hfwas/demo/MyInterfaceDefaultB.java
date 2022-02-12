package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/29
 * @Description: com.hfwas.demo
 * @version: 1.0
 */
public class MyInterfaceDefaultB implements MyInterfaceDefault{

    @Override
    public void method1() {
        System.out.println("这是抽象方法  BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类BB，这是覆盖重写了接口的默认方法");
    }

}
