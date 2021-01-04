package com.hfwas.demo04;

/**
 * @Author: HFwas
 * @Date: 2021/1/4
 * @Description: com.hfwas.demo04
 * 自定义异常类:
 *         java提供的异常类,不够我们使用,需要自己定义一些异常类
 *     格式:
 *         public class XXXExcepiton extends Exception | RuntimeException{
 *             添加一个空参数的构造方法
 *             添加一个带异常信息的构造方法
 *         }
 *      注意:
 *         1.自定义异常类一般都是以Exception结尾,说明该类是一个异常类
 *         2.自定义异常类,必须的继承Exception或者RuntimeException
 *             继承Exception:那么自定义的异常类就是一个编译期异常,如果方法内部抛出了编译期异常,就必须处理这个异常,
 *                  要么throws,要么try...catch
 *             继承RuntimeException:那么自定义的异常类就是一个运行期异常,无需处理,交给虚拟机处理(中断处理)
 * @version: 1.0
 */
public class RegisterException extends Exception{

    //空参的构造方法
    public RegisterException(){

    }

    //添加一个带参数的构造方法
    public RegisterException(String message){
        super(message);
    }

}
