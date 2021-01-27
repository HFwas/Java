package com.hfwas.java.chapter16;

/**
 * @Author: HFwas
 * @Date: 2021/1/27
 * @Description: com.hfwas.java.chapter16
 * 强引用的测试
 * @version: 1.0
 */
public class StringReferenceTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hfwas");
        StringBuffer stringBuffer = sb;

        sb = null;

        System.gc();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(stringBuffer);
    }
}
