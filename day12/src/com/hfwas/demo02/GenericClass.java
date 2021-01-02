package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2021/1/2
 * @Description: com.hfwas.demo02
 *  * 定义一个含有泛型的类，模拟ArrayList集合
 *  * 泛型是一个位置的数据类型，当我们不确定什么数据类型的时候，可以使用泛型
 *  * 泛型可以接受任意的数据类型，可以使用Integer,String,Student.....
 *  * 创建对象的时候确定泛型的数据类型
 * @version: 1.0
 */
public class GenericClass<E> {

    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
