package com.hfwas.java1.chapter02;

/**
 * @Author: HFwas
 * @Date: 2021/1/31
 * @Description: com.hfwas.java1.chapter02
 * 指令9：同步控制指令
 * @version: 1.0
 */
public class SynchronizedTest {
    private int i = 0;
    public synchronized void add(){
        i++;
    }

    private Object obj = new Object();
    public void substract(){
        synchronized (this){
            i--;
        }
    }
}
