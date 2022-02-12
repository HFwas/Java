package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2021/1/5
 * @Description: com.hfwas.demo02
 * //1.创建一个Runnable接口的实现类
 * @version: 1.0
 */
public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        //2.在实现类中重写Runnable接口的run方法,设置线程任务
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "======" + i);
        }
    }
}
