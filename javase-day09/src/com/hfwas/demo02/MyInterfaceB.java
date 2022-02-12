package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2020/12/29
 * @Description: com.hfwas.demo02
 * @version: 1.0
 */
public interface MyInterfaceB {

    public abstract void methodB();

    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("默认方法");
    }

}
