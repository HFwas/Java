package com.hfwas.demo06.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: HFwas
 * @Date: 2021/1/5
 * @Description: com.hfwas.demo04
 * 卖票案例出现了线程安全问题
 *     卖出了不存在的票和重复的票
 *
 *     解决线程安全问题的三种方案:使用Lock锁
 *     java.util.concurrent.locks.Lock接口
 *     Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。
 *     Lock接口中的方法:
 *         void lock()获取锁。
 *         void unlock()  释放锁。
 *     java.util.concurrent.locks.ReentrantLock implements Lock接口
 *
 *     使用步骤:
 *         1.在成员位置创建一个ReentrantLock对象
 *         2.在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
 *         3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
 * @version: 1.0
 */
public class RunnableImpl implements Runnable{
    //定义一个多个线程共享的票源
    private  int ticket = 100;

    Lock lock = new ReentrantLock();

    //设置线程任务:卖票
    @Override
    public void run() {
        //使用死循环,让卖票操作重复执行
        while(true){
            lock.lock();

            //先判断票是否存在
            if(ticket>0){
                //提高安全问题出现的概率,让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //票存在,卖票 ticket--
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                ticket--;
            }

            lock.unlock();
        }
    }
}
