package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/29
 * @Description: com.hfwas.demo
 * 从java 8开始，接口当中允许定义静态方法
 * 格式：
 *  public static 返回值类型 方法名称(参数列表){
 *      方法体；
 *  }
 * 提示：就是将abstract或者default换成static即可，带上方法体
 * @version: 1.0
 */
public interface MyInterfaceStatic {

    /**
     * 接口中的静态方法
     */
    public static void method(){
        System.out.println("这是接口当中的静态方法");
    }

}
