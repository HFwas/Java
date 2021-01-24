package com.hfwas.java.chapter09;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

import java.util.jar.JarEntry;

/**
 * @Author: HFwas
 * @Date: 2021/1/24
 * @Description: com.hfwas.java.chapter09
 * 元空间溢出
 * @version: 1.0
 */
public class OOMTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            OOMTest test = new OOMTest();
            for (int j = 0; j < 10000; j++) {
                //创建ClassWriter对象，用于生成类的二进制字节码
                ClassWriter classWriter = new ClassWriter(0);
                //指明版本号，修饰符，类名，包名，父类，接口
                classWriter.visit(Opcodes.V1_8,Opcodes.ACC_PUBLIC,"class" + j,null, "java/lang/Object", null);
                //返回byte[]
                byte[] bytes = classWriter.toByteArray();
                //类的加载

                i++;
            }
        } finally {
            System.out.println(i);
        }
    }
}
