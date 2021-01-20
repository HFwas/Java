package com.hfwas.java.chapter02;

import java.io.FileNotFoundException;

/**
 * @Author: HFwas
 * @Date: 2021/1/20
 * @Description: com.hfwas.java.chapter02
 * 自定义用户加载器
 * @version: 1.0
 */
public class CustomClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        try {
            byte[] bytes = getClassFromCustomPath();
            if (bytes == null) {
                throw new FileNotFoundException();
            } else {
                return defineClass(name,bytes,0,bytes.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new ClassNotFoundException();
    }

    private byte[] getClassFromCustomPath() {
        //从自定义路径中加载指定类
        //如果指定路径的字节码文件进行了加密，则需要在此方法中进行解密操作
        return null;
    }

    public static void main(String[] args) {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        try {
            Class<?> one = Class.forName("one", true, customClassLoader);
            Object o = one.newInstance();
            System.out.println(o.getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
