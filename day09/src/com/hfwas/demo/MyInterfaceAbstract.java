package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/29
 * @Description: com.hfwas.demo
 * 在任何版本的java中，接口都能定义抽象方法
 *
 * 注意事项：
 *  1.接口当中的抽象方法，修饰符必须是两个固定的关键字，public abstract
 *  2.这两个关键字修饰符可以省略(不推荐)
 * @version: 1.0
 */
public interface MyInterfaceAbstract {

    /**
     *这是一个抽象方法
     */
    public abstract void methodAbstract();

    /**
     * 这也是一个抽象方法
     */
    public void methodC();

    /**
     *这也是一个抽象方法
     */
    abstract void methodA();

    /**
     * 这也是一个抽象方法
     */
    void methodB();
}
