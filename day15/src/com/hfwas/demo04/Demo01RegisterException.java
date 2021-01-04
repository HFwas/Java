package com.hfwas.demo04;

import java.util.Scanner;

/**
 * @Author: HFwas
 * @Date: 2021/1/4
 * @Description: com.hfwas.demo04
 * 要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。
 *     分析:
 *         1.使用数组保存已经注册过的用户名(数据库)
 *         2.使用Scanner获取用户输入的注册的用户名(前端,页面)
 *         3.定义一个方法,对用户输入的中注册的用户名进行判断
 *             遍历存储已经注册过用户名的数组,获取每一个用户名
 *             使用获取到的用户名和用户输入的用户名比较
 *                 true:
 *                     用户名已经存在,抛出RegisterException异常,告知用户"亲，该用户名已经被注册";
 *                 false:
 *                     继续遍历比较
 *             如果循环结束了,还没有找到重复的用户名,提示用户"恭喜您,注册成功!";
 * @version: 1.0
 */
public class Demo01RegisterException {
    public static String[] userNames = {"zs","ls","ww"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        checkName(userName);
    }

    private static void checkName(String name) {
        if (name.equals("")) {
            try {
                throw new RegisterException("用户名不能为空");
            } catch (RegisterException e) {
                e.printStackTrace();
            }
            return;
        }

        for (String uName : userNames) {
            if (name.equals(uName)) {
                try {
                    throw new RegisterException("用户名已存在");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }

        System.out.println("恭喜你，注册成功");
    }
}
