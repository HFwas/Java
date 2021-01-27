package com.hfwas.java.chapter16;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.lang.ref.Reference;

/**
 * @Author: HFwas
 * @Date: 2021/1/27
 * @Description: com.hfwas.java.chapter16
 * 手动GC
 * @version: 1.0
 */
public class LocalVarGc {
    public static void main(String[] args) {
        LocalVarGc lvf = new LocalVarGc();

        // 发生了GC，Full GC过程当中对象被存入Old区
        lvf.localVarGC1();

        // 在YoungGC过程当中已经被回收
        //lvf.localVarGC2();

        // Minor GC过程当中没有被回收，Full GC过程当中被回收，存入Old区
        // 因为它还存放在局部变量表索引为1的槽中
        //lvf.localVarGC3();

        // 会被回收，因为索引为1的槽已经被value取代
        //lvf.localVarGC4();

        // 在localVarGC1()过程当中对象没有被回收，调用system.gc()后，在young gc过程中被回收了
        //lvf.localVarGC5();
    }

    private void localVarGC5() {
        localVarGC1();
        System.gc();
    }

    private void localVarGC4() {
        {
            byte[] bytes = new byte[1024 * 1024 * 10];
        }
        int value = 10;
        System.gc();
    }

    private void localVarGC3() {
        {
            byte[] bytes = new byte[1024 * 1024 * 10];
        }
        System.gc();
    }

    private void localVarGC2() {
        byte[] bytes = new byte[1024 * 1024 * 10];
        bytes = null;
        System.gc();
    }

    private void localVarGC1() {
        //10M
        byte[] bytes = new byte[1024 * 1024 * 10];
        System.gc();
    }
}
