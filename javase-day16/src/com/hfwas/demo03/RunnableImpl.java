package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2021/1/5
 * @Description: com.hfwas.demo03
 * 模拟卖票案例
 * @version: 1.0
 */
public class RunnableImpl implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在卖" + ticket);
                ticket--;
            }
        }
    }
}
