package com.hfwas.java1.chapter02;

/**
 * @Author: HFwas
 * @Date: 2021/1/30
 * @Description: com.hfwas.java1.chapter02
 * 指令6：操作数栈管理指令
 * @version: 1.0
 */
public class StackOperatorTest {
    public void print(){
        Object o = new Object();
        String string = o.toString();
    }

    // 类似的
    public void foo(){
        bar();
    }

    private long bar() {
        return 0;
    }

    public long nextIndex(){
        return index++;
    }

    private long index = 0;
}
