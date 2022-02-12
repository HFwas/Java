package com.hfwas.demo03;

import java.util.ArrayList;

/**
 * @Author: HFwas
 * @Date: 2020/12/14
 * @Description: com.hfwas.demo03
 * @version: 1.0
 */
public class Manager extends User{

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //查看群主钱数
        //当前余额
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;
        }

        //扣钱，重新设置余额
        super.setMoney(leftMoney - totalMoney);

        //发红包需要平均拆分成count份
        int avg = totalMoney / count;
        //余数，也就是剩下的余额
        int mod = totalMoney % count;

        //除不开的零头，包在最后一个红包当中
        //下面吧红包一个一个放到集合当中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        //最后一个红包
        int last = avg + mod;

        redList.add(last);

        return redList;
    }
}
