package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2021/1/5
 * @Description: com.hfwas.demo02
 * public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
 *     毫秒数结束之后,线程继续执行
 * @version: 1.0
 */
public class Demo02Sleep {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
