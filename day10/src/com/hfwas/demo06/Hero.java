package com.hfwas.demo06;

/**
 * @Author: HFwas
 * @Date: 2020/12/31
 * @Description: com.hfwas.demo06
 * 游戏当中的游戏角色类
 * @version: 1.0
 */
public class Hero {
    //英雄的名字
    private String name;
    //英雄的年龄
    private int age;
    //武器
    private Weapon weapon;

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public void attack(){
        System.out.println("年龄为" + age + "的" + name + "用" + weapon.getCode() + "攻击敌方");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
