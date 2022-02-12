package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/10
 * @Description: 定义一个类，模拟"手机"事务
 * @version: 1.0
 */
public class Phone {

    //成员变量
    String brand; //品牌
    double price; //价格
    String color; //颜色

    //成员方法
    public void call(String who){
        System.out.println("给" + who + "打电话");
    }

    public void message(){
        System.out.println("发消息");
    }
}
