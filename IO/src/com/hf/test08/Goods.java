package com.hf.test08;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Goods implements Externalizable{
	private static String brand = "尚硅谷";
	private String name;
	private double price;
	private transient int sale;
	public Goods(String name, double price, int sale) {
		super();
		this.name = name;
		this.price = price;
		this.sale = sale;
	}
	public Goods() {
		super();
	}
	public static String getBrand() {
		return brand;
	}
	public static void setBrand(String brand) {
		Goods.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	@Override
	public String toString() {
		return "Goods [brand = " + brand +",name=" + name + ", price=" + price + ",sale = " + sale +"]";
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		//程序员自己定制要序列化的内容，顺序等
		//这两个方法是在对象被序列化和反序列化的过程中，JVM帮我们调用
		out.writeUTF(brand);//静态的也序列化
		out.writeUTF(name);
		out.writeDouble(price);
		out.writeInt(sale);//有transient也序列化
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		//程序员自己定制要反序列化的内容，顺序等，建议与序列化的顺序一致
		brand = in.readUTF();
		name = in.readUTF();
		price = in.readDouble();
		sale = in.readInt();
	}
	
}
