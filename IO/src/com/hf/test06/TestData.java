package com.hf.test06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/*
 * 程序中有这样一组数据：
 * int num = 10;
 * char c = '好';
 * double d = 88.88;
 * String info = "尚硅谷真好！";
 * boolean good = true;
 * 程序运行过程中，想要临时退出，下次希望从这个状态继续恢复执行。
 * 希望Java能够输出各种数据类型的数据，读取时，能还原各种数据类型的数据。
 * 因为这些数据不是纯文本，那么只能选择字节流。
 * Java中IO流的类的体系设计，隐含了一个设计模式：装饰者设计模式
 * DataOutputStream在OutputStream的基础上，增加了很多方法：
 *   writeXxx(...)
 * DataInputStream在InputStream的基础尚自，增加了很多方法：
 *   Xxx readXxx()
 * 要求：
 * 	用DataOutputStream写的文件或数据，得用DataInputStream来读取。
 * 	并且要求读的顺序与写的顺序要一致。
 */
public class TestData {
	@Test
	public void test02()throws IOException{
		FileInputStream fis = new FileInputStream("data.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		int num = dis.readInt();
		char c = dis.readChar();
		double d = dis.readDouble();
		String s = dis.readUTF();
		boolean b = dis.readBoolean();
		
		System.out.println(num);
		System.out.println(c);
		System.out.println(d);
		System.out.println(s);
		System.out.println(b);
		
		dis.close();
		fis.close();
	}
	
	@Test
	public void test01()throws IOException{
		int num = 10;
		char c = '好';
		double d = 188.88;
		String info = "尚硅谷真好！";
		boolean good = true;
		 
		FileOutputStream fos = new FileOutputStream("data.dat");
		/*fos.write(num);//错误的
		fos.write(c);
		fos.write((byte)d);*/
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeInt(num);
		dos.writeChar(c);
		dos.writeDouble(d);
		dos.writeUTF(info);
		dos.writeBoolean(good);
		
		dos.close();
		fos.close();
	}
}
