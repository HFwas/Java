package com.hfwas.juc.

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: HFwas
 * @Date: 2020/12/2
 * @Description: 验证Lock的可中断和不可中断
 * 一个线程获得锁后，另一个线程想要获得锁，必须处于阻塞或等待状态，如果第一个线程不释放锁，
 * 第二个线程会一直阻塞或等待，不可被中断。
 * @version: 1.0
 */
public class Interruptible {
    private static Lock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        test01();
    }

    //演示Lock的可中断
    public static void test01() throws InterruptedException {
        Runnable runnable = ()->{
            String name = Thread.currentThread().getName();
            boolean time = false;
            try {
                //lock.lock();
                time = lock.tryLock(3, TimeUnit.SECONDS);
                if (time){
                    System.out.println(name + "获得锁,线程进入");
                    Thread.sleep(50000);
                }else{
                    System.out.println(name + "在指定的时间内没有获得锁");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();
        t1.sleep(5000);

        Thread t2 =new Thread(runnable);
        t2.start();


//        System.out.println("中断前");
//        t2.interrupt();
//        System.out.println("中断后");
//
//        Thread.sleep(5000);
//        System.out.println(t1.getState());
//        System.out.println(t2.getState());
    }
}
