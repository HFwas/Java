package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/29
 * @Description: com.hfwas.demo
 * @version: 1.0
 */
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract{

    @Override
    public void methodAbstract() {
        System.out.println("这是方法");
    }

    @Override
    public void methodC() {
        System.out.println("这是第三个方法");
    }

    @Override
    public void methodA() {
        System.out.println("这是第一个方法");
    }

    @Override
    public void methodB() {
        System.out.println("这是第二个方法");
    }
}
