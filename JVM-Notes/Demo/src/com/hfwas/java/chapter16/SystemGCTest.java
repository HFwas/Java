package com.hfwas.java.chapter16;

/**
 * @Author: HFwas
 * @Date: 2021/1/27
 * @Description: com.hfwas.java.chapter16
 * @version: 1.0
 */
public class SystemGCTest {
    public static void main(String[] args) {
        new SystemGCTest();

        //提醒JVM的垃圾回收器执行gc,但是不确定是否马上能gc
        //与Runtime.getRuntime().gc();的作用类似
        System.gc();

        //强制调用使用引用的对象的finalize()方法
        System.runFinalization();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("SystemGCTest类中重写了finalize()方法");
    }
}
