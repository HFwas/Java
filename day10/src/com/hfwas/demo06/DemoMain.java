package com.hfwas.demo06;

/**
 * @Author: HFwas
 * @Date: 2020/12/31
 * @Description: com.hfwas.demo06
 * @version: 1.0
 */
public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(25);

        Weapon weapon = new Weapon("多兰剑");
        hero.setWeapon(weapon);

        hero.attack();
    }

}
