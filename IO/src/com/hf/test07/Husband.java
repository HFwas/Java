package com.hf.test07;

import java.io.Serializable;

/*
 * 在序列化Husband对象，要求Wife序列化。
 * 这里发现String类型也实现序列化接口了。
 * 
 * 结论：
 * 	序列化一个对象时，要求它的属性要么是基本数据类型，如果是引用数据类型，这个引用数据类型也必须实现Serializable接口。
 *  序列化一个数组，要求元素类型实现Serializable接口。
 */
public class Husband implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private Wife wife;
	public Husband(String name, Wife wife) {
		super();
		this.name = name;
		this.wife = wife;
	}
	public Husband() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wife getWife() {
		return wife;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}
	@Override
	public String toString() {
		return "Husband [name=" + name + ", wife=" + wife.getName() + "]";
	}
	
}
