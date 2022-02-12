package com.hfwas.demo05;

/**
 * @Author: HFwas
 * @Date: 2021/1/12
 * @Description: com.hfwas.demo05
 * 通过对象名引用成员方法
 *     使用前提是对象名是已经存在的,成员方法也是已经存在
 *     就可以使用对象名来引用成员方法
 * @version: 1.0
 */
public class Demo01ObjectMethodReference {
    public static void main(String[] args) {
        printS((string)->{
            MethodRerObject mr = new MethodRerObject();
            mr.printString(string);
        });



    }

    private static void printS(Printable printable) {
        printable.print("niHdjo");
    }

}
