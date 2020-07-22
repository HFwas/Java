package com.hf.test03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP：面向连接，可靠的，基于字节流的
 * 		服务器：等待被连接的过程
 * 
 * ServerSocket：只负责接受和建立连接，不负责数据的传输
 * Socket：负责数据的传输
 * 
 * 步骤：
 * 1、开启服务器
 * 	  指定服务器监听的端口号
 * 2、等待客户端并接受客户端的连接
 * 
 * 3、接受/发送数据
 * 发送方：输出流
 * 接受方：输入流
 * 
 * 4、断开连接
 * 
 * 5、关闭服务器
 */
public class TestServer {
	public static void main(String[] args) throws IOException {
		//1、开启服务器：网卡驱动就监听9999端口号的数据
		ServerSocket server = new ServerSocket(9999);
		
		//2、等待客户端并接受客户端的连接
		Socket socket = server.accept();//这句代码执行一次，就接受一个客户端连接
		System.out.println("一个客户端连接成功!");
		
		//3、接受数据
		InputStream in = socket.getInputStream();
		byte[] data = new byte[1024];
		int len;
		System.out.println("服务器收到：");
		while((len = in.read(data)) != -1){
			System.out.println(new String(data,0,len));
		}
		
		//4、例如：发送数据
		//发送：欢迎你登录
		//字节流，输出流  OutputStream
		//(1)获取输出流
		OutputStream out = socket.getOutputStream();
		//(2)发送数据
		out.write("欢迎你登录".getBytes());
		
		//4、断开连接
		socket.close();
		
		//5、关闭服务器
		server.close();
	}
}
