package com.hfwas.demo05;

/**
 * @Author: HFwas
 * @Date: 2021/1/5
 * @Description: com.hfwas.demo03
 * 模拟卖票案例
 * 卖票案例出现了线程安全问题
 *     卖出了不存在的票和重复的票
 *
 *     解决线程安全问题的二种方案:使用同步方法
 *     使用步骤:
 *         1.把访问了共享数据的代码抽取出来,放到一个方法中
 *         2.在方法上添加synchronized修饰符
 *
 *     格式:定义方法的格式
 *     修饰符 synchronized 返回值类型 方法名(参数列表){
 *         可能会出现线程安全问题的代码(访问了共享数据的代码)
 * @version: 1.0
 */
public class RunnableImpl implements Runnable{
    private static int ticket = 100;

    @Override
    public void run() {
        //this:com.hfwas.demo05.RunnableImpl@1b6d3586
        System.out.println("this:" + this);

        while (true) {
            sellTicket();
        }
    }

    /**
     * 静态方法
     * 锁对象是：不是this了
     * 而是本类的class属性，-->文件对象
     */
    private static /*synchronized*/ void sellTicket2() {
        //synchronized (this) {
        synchronized (RunnableImpl.class) {
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "正在卖" + ticket);
                ticket--;
            }
        }

    }

    private synchronized void sellTicket1() {
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "正在卖" + ticket);
            ticket--;
        }
    }

    /**
     * 定义一个同步方法
     *         同步方法也会把方法内部的代码锁住
     *         只让一个线程执行
     *         同步方法的锁对象是谁?
     *         就是实现类对象 new RunnableImpl()
     *         也是就是this
     */
    private /*synchronized*/ void sellTicket() {
        synchronized (this) {
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "正在卖" + ticket);
                ticket--;
            }
        }
    }
}
