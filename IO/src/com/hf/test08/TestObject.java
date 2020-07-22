package com.hf.test08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/*
 * 1、java.io.Serializable接口：
 * 		类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
 * 		可序列化类的所有子类型本身都是可序列化的。序列化接口没有方法或字段，仅用于标识可序列化的语义。
 *   如果实现Serializable接口，对象如何序列化，各个属性序列化的顺序是什么，都是默认的，程序员无法指定，也不用关心。
 *   如果属性前面有static和transient修饰，不参与序列化。
 * 2、java.io.Externalizable接口：
 *    若某个要完全控制某一对象及其超类型的流格式和内容，则它要实现 Externalizable接口的 writeExternal和 readExternal方法。
 *    程序员在writeExternal方法中，自定定制哪些属性要序列化，顺序是什么样。
 *    程序员在readExternal方法中，自定定制哪些属性要反序列化，顺序和writeExternal的方法中一致。
 */
public class TestObject {
	@Test
	public void test01() throws IOException{
		Goods goods = new Goods("《从入门到放弃》", 99.99, 1000);
		Goods.setBrand("atguigu");
		
		FileOutputStream fos = new FileOutputStream("goods.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(goods);
		
		oos.close();
		fos.close();
	}
	
	@Test
	public void test02()throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("goods.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		System.out.println(obj);
		
		ois.close();
		fis.close();
	}
}
