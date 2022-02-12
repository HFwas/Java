package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/10
 * @Description: com.hfwas.demo
 * @version: 1.0
 */
public class PhoneParam {

    public static void main(String[] args) {
        Phone one = new Phone();
        one.color = "蓝色";
        one.price = 8888.0;
        one.brand = "HTC";

        method(one);

        Phone phone = getPhone();
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
    }

    public static void method(Phone phone){
        System.out.println(phone.color);
        System.out.println(phone.price);
        System.out.println(phone.brand);
    }

    //方法返回值为对象
    public static Phone getPhone(){
        Phone phone = new Phone();
        phone.brand = "三星";
        phone.price = 5633.0;
        phone.color = "纯白色";

        return phone;
    }

}
