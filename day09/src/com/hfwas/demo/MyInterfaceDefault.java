package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/29
 * @Description: com.hfwas.demo
 * 从java 8开始，接口就允许定义默认方法
 * 格式：
 *      public default 返回值类型 方法名称（参数列表）{
 *
 *      }
 * 备注：接口中的默认方法，可以解决接口升级的问题
 * @version: 1.0
 */
public interface MyInterfaceDefault {

    /**
     *抽象方法
     */
    public abstract void method1();

    /**
     *新添加一个抽象方法
     */
//    public abstract void method2();

    /**
     * 将新添加的方法，改成默认的方法
     */
    public default void methodDefault(){
        System.out.println("这是默认的方法");
    }

}
