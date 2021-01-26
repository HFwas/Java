package com.hfwas.java.chapter15;

/**
 * @Author: HFwas
 * @Date: 2021/1/26
 * @Description: com.hfwas.java.chapter15
 * 测试object类中的finalize()方法，即对象的finalization机制
 * @version: 1.0
 */
public class CanReliveObj {
    // 类变量，属于GC Roots的一部分
    public static CanReliveObj obj;

    // 此方法只能被调用一次
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用当前类重写的finalize()方法");
        //当前回收对象在finalize()方法中与引用链上的obj建立了联系
        obj = this;
    }

    public static void main(String[] args) throws InterruptedException {
        obj = new CanReliveObj();
        // 对象第一次成功拯救自己
        obj = null;
        // 调用垃圾回收器
        System.gc();
        System.out.println("-----------------第一次gc操作------------");
        // 因为Finalizer线程的优先级比较低，暂停2秒，以等待它
        Thread.sleep(2000);
        if (obj == null) {
            System.out.println("obj is dead");
        } else {
            System.out.println("obj is still alive");
        }

        System.out.println("-----------------第二次gc操作------------");
        // 自救失败
        obj = null;
        System.gc();
        // 下面代码和上面代码是一样的，但是 canReliveObj却自救失败了
        Thread.sleep(2000);
        if (obj == null) {
            System.out.println("obj is dead");
        } else {
            System.out.println("obj is still alive");
        }

    }
}
