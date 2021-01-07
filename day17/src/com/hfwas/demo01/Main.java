package com.hfwas.demo01;

/**
 * 测试包子
 */
public class Main {

    public static void main(String[] args) {
	    // write your code here
        BaoZi baoZi = new BaoZi();
        //创建包子铺线程，生产包子
        new BaoZiPu(baoZi).start();
        //创建吃货线程：吃包子
        new ChiHuo(baoZi).start();

    }
}
