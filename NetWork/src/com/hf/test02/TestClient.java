package com.hf.test02;

import java.io.IOException;
import java.io.InputStream;
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
 */
public class TestClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
//		1、连接服务器
		Socket socket = new Socket("192.168.30.142",9999);
		
		//2、例如：接受数据
		//字节流，输入流，InputStream
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

