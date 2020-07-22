package com.hf.test07;

import java.io.Serializable;

public class Goods implements Serializable{
	private static final long serialVersionUID = 1L;
	private static String brand = "尚硅谷";
	private String name;
	private double price;
	private transient int sale;//transient表示sale属性不需要序列化
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
		return "Goods [brand = "+ brand +",name=" + name + ", price=" + price + ", sale=" + sale + "]";
	}
	
}
