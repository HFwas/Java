package com.hfwas.java.chapter09;

/**
 * @Author: HFwas
 * @Date: 2021/1/24
 * @Description: com.hfwas.java.chapter09
 * 静态引用对应的对象实体始终都存在堆空间
 * jdk7:
 *      -Xms 200m -Xmx 200m --XX:Permsize=300m -XX:MaxPermsize=300m -XX:+PrintgcDetails
 * jdk 8:
 *      -Xms200m -Xmx200m -XX:MetaspaceSize=300m -XX:MaxMetaspaceSize=300m -XX：+PrintGcDetails
 * @version: 1.0
 */
public class StaticFieldTest {
    //100MB
    private static byte[] arr = new byte[1024 * 1024 * 100];

    public static void main(String[] args) {
        System.out.println(StaticFieldTest.arr);

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
