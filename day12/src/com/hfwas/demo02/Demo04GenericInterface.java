package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2021/1/2
 * @Description: com.hfwas.demo02
 *
 * @version: 1.0
 */
public class Demo04GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl1 impl1 = new GenericInterfaceImpl1();
        impl1.method01("aaaaa");


        GenericInterfaceImpl2<Integer> impl2 = new GenericInterfaceImpl2<>();
        impl2.method01(111);

        GenericInterfaceImpl2<Double> impl21 = new GenericInterfaceImpl2<>();
        impl21.method01(12.25);
    }
}
