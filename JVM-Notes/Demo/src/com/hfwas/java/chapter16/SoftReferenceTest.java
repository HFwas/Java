package com.hfwas.java.chapter16;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author: HFwas
 * @Date: 2021/1/27
 * @Description: com.hfwas.java.chapter16
 * 软引用的测试
 * @version: 1.0
 */
public class SoftReferenceTest {
    public static class User{
        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int id;
        public String name;

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        // 创建对象，建立软引用
        User user = new User(1, "张三");
        //创建软引用
        SoftReference<User> osr = new SoftReference<>(user);
        //取消强引用
        user = null;
        // 从软引用当中重新获得强引用对象
        System.out.println(osr.get());

        System.gc();
        System.out.println("gc之后：");
        // 垃圾回收之后获得软引用中的对象
        // 由于堆空间内存足够，所以不会回收软引用的可达对象
        System.out.println(osr.get());

        try {
            // 让系统认为资源紧张
            byte[] bytes = new byte[1024 * 1024 * 7];
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 再报OOM之前，垃圾回收器会回收软引用的可达对象
            System.out.println(osr.get());
        }

    }
}
