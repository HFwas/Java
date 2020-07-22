package com.hf.test03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP：
 * 	 客户端，主动连接服务器
 * Socket(InetAddress address, int port) 
 * Socket(String host, int port)
 * 步骤：
 * 1、连接服务器
 * Socket socket = new Socket("192.168.30.142",9999);
 * 2、发送或接受数据
 * 3、断开连接
 * 客户端给服务器发送一个“你好”，服务器回复“欢迎你登录”
 */
public class TestClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
//		1、连接服务器
		Socket socket = new Socket("192.168.30.142",9999);
		
		//2、例如：发送你好
		OutputStream out = socket.getOutputStream();
		out.write("你好".getBytes());
//		out.close();//错误的，如果调用out.close()会导致socket的close()
		//如果仅仅表示不发送了，还要接收，那么选择半关闭，只关闭输出通道
		socket.shutdownOutput();
		
		//3、例如：接受数据
		//字节流，输入流，InputStream
		System.out.println("客户端收到：");
		InputStream in = socket.getInputStream();
		byte[] data = new byte[1024];
		int len;
		while((len = in.read(data)) != -1){
			System.out.println(new String(data,0,len));
		}
		
		//3、断开
		socket.close();
	}
}
