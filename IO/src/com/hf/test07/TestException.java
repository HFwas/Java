package com.hf.test07;

/*
 * 自定义异常时：
 * （1）继承Throwable或它的子类
 * 一般是Exception和RuntimeException比较多
 * （2）建议保留两个构造器，一个无参，一个可以message赋值的构造器
 * （3）建议增加serialVersionUID
 */
public class TestException {

}
class MyException extends Exception{

	private static final long serialVersionUID = 1L;

	public MyException() {
		super();
		
	}

	public MyException(String message) {
		super(message);
		
	}
	
}