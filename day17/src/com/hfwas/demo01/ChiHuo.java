package com.hfwas.demo01;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo01
 * @version: 1.0
 */
public class ChiHuo extends Thread{
    //1.创建一个包子变量
    private BaoZi baoZi;

    //2.使用带参数构造方法，给包子赋值
    public ChiHuo(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    //设置线程任务：吃包子
    @Override
    public void run() {
        //设置死循环，一致吃包子
        while (true) {
            //必须保证两个线程只有一个线程再执行
            synchronized (baoZi) {
                //状态判断
                if (baoZi.flag == false) {
                    //吃货进入wait方法等待
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //待唤醒之后执行的代码，吃包子
                System.out.println("吃货正在吃：" + baoZi.pi + baoZi.xian + "的包子");
                //吃货吃完包子
                //修改包子的状态为false

                baoZi.flag = false;

                //吃货唤醒包子铺线程，生产包子
                baoZi.notify();
                System.out.println("吃货已经吧：" + baoZi.pi + baoZi.xian + "的包子吃完了，包子铺要开始生产包子了");
            }
        }
    }
}
