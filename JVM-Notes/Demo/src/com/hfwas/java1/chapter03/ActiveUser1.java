package com.hfwas.java1.chapter03;

import org.junit.Test;

import java.io.*;

/**
 * @Author: HFwas
 * @Date: 2021/2/1
 * @Description: com.hfwas.java1.chapter03
 * 测试类的主动使用：意味着会调用类的<clinit>()方法:即执行了类的初始化
 *
 * - 当创建一个类的实例时，比如使用new关键字，或者通过反射、克隆、反序列化
 * - 当调用类的静态方法时，即当使用了字节码 invokestatic指令。
 * - 当使用类、接口的静态字段时（final修饰特殊考虑），比如，使用 getstatic或者 putstatic指令。（对应访问变量赋值变量操作）
 * -
 * -
 * - 如果一个接口定义了 default方法，那么直接实现或者间接实现该接口的类的初始化，该接口要在其之前被初始化。
 * - 当虚拟机启动时，用户需要指定一个要执行的主类（包含main（）方法的那个类），虚拟机会先初始化这个主类
 * - 当初次调用 Methodhandle实例时，初始化该 Methodhandle指向的方法所在的类。（涉及解析REF_getstatic、REF_ putstatic、 REF_invokestatic方法句柄对应的类）
 * @version: 1.0
 */
public class ActiveUser1 {
    public static void main(String[] args) {
        Order order = new Order();

    }

    //当创建一个类的实例时，比如使用new关键字，或者通过反射、克隆、反序列化
    // 序列化的过程
    @Test
    public void test01(){
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("1.txt"));
            oos.writeObject(new Order());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 反序列化的过程
    @Test
    public void test02(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("1.txt"));
            Order order = (Order) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //调用类的静态方法时，即当使用了字节码 invokestatic指令。
    @Test
    public void test03(){
        Order.method01();
    }


}

class Order implements Serializable{
    static {
        System.out.println("Order类的初始化过程");
    }

    public static void method01(){
        System.out.println("Order method....");
    }
}
