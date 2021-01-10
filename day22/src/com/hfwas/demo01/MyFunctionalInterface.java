package com.hfwas.demo01;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo01
 * 函数式接口:有且只有一个抽象方法的接口,称之为函数式接口
 *     当然接口中可以包含其他的方法(默认,静态,私有)
 *     @FunctionalInterface注解
 *     作用:可以检测接口是否是一个函数式接口
 *         是:编译成功
 *         否:编译失败(接口中没有抽象方法抽象方法的个数多余1个)
 *
 * @version: 1.0
 */
@FunctionalInterface
public interface MyFunctionalInterface {

    //抽象方法
    void method1();

    //抽象方法
    //void method2();
}
