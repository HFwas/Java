package com.hf.test07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/*
 * 序列：排队，
 * 把对象转为字节序列，序列化的过程
 * ObjectOutputStream：用于输出对象，把对象转成字节数据输出，对象的输出过程称为序列化。
 * 		ObjectOutputStream比OutputStream多了很多方法，其中一个是  writeObject(obj)
 * 只能将支持 java.io.Serializable 接口的对象写入流中。每个 serializable 对象的类都被编码，
 * 编码内容包括类名和类签名、对象的字段值和数组值，以及从初始对象中引用的其他所有对象的闭包。 
	writeObject 方法用于将对象写入流中。所有对象（包括 String 和数组）都可以通过 writeObject 写入。
	可将多个对象或基元写入流中。必须使用与写入对象时相同的类型和顺序从相应 ObjectInputstream 中读回对象。
 * ObjectInputstream：用于输入对象，把字节序列转为对象读取，对象的读取过程称为反序列化。
 * 		ObjectInputstream比InputStream多了很多方法，其中一个是 Object readObject()
 */
public class TestObject {
	@Test
	public void test02()throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("obj.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		//把字节流中的数据，转为一个对象，读取过程中会创建对象，new对象时需要找对象的类型
		System.out.println(obj);
		ois.close();
		fis.close();
	}
	
	@Test
	public void test01()throws IOException{
		User u = new User("chailinyan","123456",28);
		
		FileOutputStream fos = new FileOutputStream("obj.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//数据：程序-->oos --> fos -->obj.dat
		oos.writeObject(u);
		/*
		 * 如果没有实现Serializable接口的类型，在序列化时，报错误NotSerializableException，不能序列化。
		 * 如果要解决问题，User类需要实现java.io.Serializable接口
		 */
		oos.close();
		fos.close();
	}
}
