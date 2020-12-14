package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2020/12/14
 * @Description: com.hfwas.demo03
 * @version: 1.0
 */
public class User {

    private String name;
    private int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //展示一下
    public void show(){
        System.out.println("我是：" + name + "有多少钱：" + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
