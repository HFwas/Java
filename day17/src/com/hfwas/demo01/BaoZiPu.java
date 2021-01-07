package com.hfwas.demo01;

/**
 * @Author: HFwas
 * @Date: 2021/1/6
 * @Description: com.hfwas.demo01
 * @version: 1.0
 */
public class BaoZiPu extends Thread{

    //1.创建一个包子变量
    private BaoZi baoZi;

    //2.使用带参数构造方法，给包子赋值
    public BaoZiPu(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    //设置线程任务：生产包子
    @Override
    public void run() {
        //定义一个变量
        int count = 0;

        //让包子铺一致生产包子
        while (true) {
            //必须同时保证只有一个线程在执行，使用同步技术
            synchronized (baoZi) {
                if (baoZi.flag == true) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行，包子铺生产包子
                //增加一些趣味性：交替生产两种包子
                if (count % 2 == 0) {
                    //生产 薄皮三鲜
                    baoZi.pi = "薄皮";
                    baoZi.xian = "三鲜";
                }else {
                    //生产 饼皮牛肉大葱
                    baoZi.pi = "饼皮";
                    baoZi.xian = "牛肉大葱";
                }
                count++;
                System.out.println("包子铺正在生产:" + baoZi.pi + baoZi.xian + "包子");
                //生产包子要三秒钟
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //包子铺生产好包子
                //修改包子的状态为true
                baoZi.flag = true;
                //
                baoZi.notify();
                System.out.println("包子铺已经生产好了：" + baoZi.pi + baoZi.xian + "包子，已经可以开始吃了");
            }
        }

    }
}
