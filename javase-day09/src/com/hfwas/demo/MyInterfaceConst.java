package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/29
 * @Description: com.hfwas.demo
 * 接口当中也可以定义"成员变量"，但是必须使用public static final三个关键字进行修饰
 * 从效果上看，这其实就是接口的[常量]
 * 格式：
 *      public static final 数据类型 常量名称 = 数据值;
 * 备注：
 *      一旦使用final关键字进行修饰，说明不可改变
 *
 * 注意事项：
 *      1.接口当中的常量，可以省略public static final,注意：不写照样是这样的
 *      2.
 * @version: 1.0
 */
public interface MyInterfaceConst {

    /**
     * 静态常量
     */
    public static final int NUM_OF_CLASS = 10;


}
