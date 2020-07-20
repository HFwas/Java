package com.hf.test04;
/*
 * 1、IO：
 * 	I：input，输入
 * 	O：output：输出
 * （1）如果对于File对象来说，输入和输出操作只能针对文件，不能针对目录。
 * （2）IO操作不仅仅是针对文件，它可以从网络中输入和输出...
 * （3）输入：
 *    输出：
 *    参照物是当前程序
 *   例如：把数据写到文件中：输出操作   把数据从程序中输出到文件
 *       从文件读取数据： 输入操作
 *   例如：
 *   	服务器端发送数据给客户端：
 *   			对于服务器来说是输出
 *   			对于客户端来说是输入
 * 2、IO的分类
 * （1）方向
 * 输入流和输出流
 * （2）操作数据的单位
 * 字节流和字符流
 * 字节流：以字节为单位byte
 * 字符流：以字符为单位char
 * 字符流只能用于读/写纯文本数据
 * 	  纯文本数据：内容全部是字符
 *   纯文本文件：
 *   		.txt，.html，.xml，.properties等是纯文本文件
 *   		.doc，.xls，.ppt等都不是
 * 字节流适用于任何类型的文件。
 * 如果是纯文本文件用字符流快。
 * （3）功能角色不同
 * 节点流和处理流
 * 
 * 节点流：和某个节点关联，例如：文件流。。。
 * 处理流：在节点流的基础上，加其他的处理功能的，加装饰功能的，例如：缓冲流，序列化与反序列化等
 * 
 * 3、IO流有四大抽象的基类/超类/父类
 * （1）InputStream：字节输入流
 * （2）OutputStream：字节输出流
 * （3）Reader：字符输入流
 * （4）Writer：字符输出流
 * 例如：文件IO流
 * （1）FileInputStream：文件字节输入流
 * （2）FileOutputStream：文件字节输出流
 * （3）FileReader：文件字符输入流
 * （4）FileWriter：文件字符输出流
 * 例如：缓冲IO流
 * （1）BufferedInputStream：字节缓冲输入流
 * （2）BufferedOutputStream：字节缓冲输出流
 * （3）BufferedReader：字符缓冲输入流
 * （4）BufferedWriter：字符缓冲输出流
 */
public class TestIO01 {
	
}
