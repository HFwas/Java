package com.hfwas.principle.singleresponsibility;

/**
 * @Author: HFwas
 * @Date: 2021/1/15
 * @Description: com.hfwas.principle.singleresponsibility
 * @version: 1.0
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {

    }
}

/**
 * 方式三的分析：
 *  1.这种修改方法没有对原来的类做过多的修改，只是增加方法
 *  2.这里虽然没有在类这个级别上遵守单一职责原则，但是在别的方法级别上仍然遵守单一职责
 */
class Vehicle2{
    public void run(String vehicle){
        System.out.println(vehicle + "");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle + "在天空中运行");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle + "在水中上运行");
    }
}
