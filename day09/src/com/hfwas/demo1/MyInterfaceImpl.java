package com.hfwas.demo1;

/**
 * @Author: HFwas
 * @Date: 2020/12/29
 * @Description: com.hfwas.demo1
 * @version: 1.0
 */
public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{

    @Override
    public void methodA() {
        System.out.println("覆盖重写了AA");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AA,BB的方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了BB");
    }
}
