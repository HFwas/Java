package com.hfwas.juc.synchronizedd;

/**
 * @Auther: HFwas
 * @Date: 2020/12/2
 * @Description: 验证线程的可见性问题
 * @version: 1.0
 */
public class TestVisiblity {
    //1.创建一个静态变量
    //第一种方法：使用volatile解决可见性问题
    private static  volatile boolean flag = true;

    private static  Object obj = new Object();
    public static void main(String[] args) throws InterruptedException {
        //2.创建一个线程不断读取共享变量
        new Thread(()->{
            while (flag){
                //第二种方法：使用synchronized解决
                /*synchronized (obj){

                }*/

                //sout中也使用到了synchronized关键字，所以会停
                System.out.println(flag);
            }
        }).start();

        Thread.sleep(2000);

        //3.创建一个线程修改变量的值
        new Thread(()->{
            flag = false;
            System.out.println("线程已经修改了变量的值");
        }).start();

    }

}
