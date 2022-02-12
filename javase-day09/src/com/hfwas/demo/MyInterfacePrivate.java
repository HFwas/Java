package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/29
 * @Description: com.hfwas.demo
 * 问题描述：
 *  我们需要抽取一个共有方法，用来解决两个默认方法之间的重复代码问题
 *  但是这个共有方法不应该让实现类使用
 * 解决方案：
 *  从java 9开始，接口当中允许定义私有方法
 *  1.普通私有方法，解决当中默认方法之间重复代码的问题
 *  格式：
 *      private 返回值类型 方法名称(参数列表){
 *          方法体;
 *      }
 *
 * @version: 1.0
 */
public interface MyInterfacePrivate {

    /**
     * 默认方法
     */
    public default void method1(){
        System.out.println("默认方法1");
        methodCommon();
    }

    /**
     * 默认方法
     */
    public default void method2(){
        System.out.println("默认方法2");
        methodCommon();
    }

    /**
     * 抽取公共部分
     */
    private void methodCommon(){
        System.out.println("ss");
        System.out.println("ssss");
        System.out.println("ssddd");
    }

}
