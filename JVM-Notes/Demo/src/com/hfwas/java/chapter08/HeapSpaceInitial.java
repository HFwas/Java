package com.hfwas.java.chapter08;

/**
 * @Author: HFwas
 * @Date: 2021/1/22
 * @Description: com.hfwas.java.chapter08
 * -Xms:设置栈空间(年轻代+老年代)的初始内存大小
 *      -X：是JVM的运行参数
 *      ms:是memory start
 * -Xmx:设置栈空间(年轻代+老年代)的最大内存大小
 *
 * 2.默认堆空间的大小
 *      初始内存大小：物理电脑内存大小/64
 *      最大内存大小：物理电脑内存大小/4
 *
 * 3.手动设置：-Xms600m -Xmx600m
 *      开发当中建议将初始堆内存和最大的堆内存设置成相同的值
 * @version: 1.0
 */
public class HeapSpaceInitial {
    public static void main(String[] args) {
        //返回Java虚拟机中的堆内存大小
        long totalMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        //返回Java虚拟机试图使用的最大堆内存量
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        //-Xmx:121M
        //-Xmx:1776M
        //系统内存大小：7.5625G
        //系统内存大小：6.9375G
        System.out.println("-Xmx:" + totalMemory + "M");
        System.out.println("-Xmx:" + maxMemory + "M");
        System.out.println("系统内存大小：" + totalMemory * 64.0 /1024 + "G");
        System.out.println("系统内存大小：" + maxMemory * 4.0 /1024 + "G");

//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
