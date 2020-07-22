package com.hf.test07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/*
 * 需求：
 *   不是对象中的所有属性都需要序列化的。
 *   
 * 如果某个属性不需要序列化，可以在属性的前面加一个关键字：transient 。
 * 如果某个属性是static，那么也不会序列化。因为静态的变量不属于某个对象，而是整个类的，所以不需要随着对象的序列化而序列化。
 */
public class TestObject3 {
	@Test
	public void test02()throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("goods.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		System.out.println(obj);
		
		ois.close();
		fis.close();
	}
	@Test
	public void test01()throws IOException{
		Goods.setBrand("atguigu");
		//现在要序列化这个产品的信息，但是希望销量100不序列化
		Goods g = new Goods("裙子",88.8,100);
		
		FileOutputStream fos = new FileOutputStream("goods.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(g);
		
		oos.close();
		fos.close();
	}
}
