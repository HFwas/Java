package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2021/1/2
 * @Description: com.hfwas.demo02
 * 测试含有泛型的方法
 * @version: 1.0
 */
public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod method = new GenericMethod();
        method.getMethod("add");
        method.getMethod(123);
        method.getMethod(false);
        method.getMethod('d');
        method.getMethod(12.3);

        //静态方法推荐通过类名调用
        GenericMethod.getMethod2(123);
        GenericMethod.getMethod2(false);
        GenericMethod.getMethod2('s');
        GenericMethod.getMethod2("dddd");
    }
}
