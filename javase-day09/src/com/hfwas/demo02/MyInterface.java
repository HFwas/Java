package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2020/12/29
 * @Description: com.hfwas.demo02
 * @version: 1.0
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB{

    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
