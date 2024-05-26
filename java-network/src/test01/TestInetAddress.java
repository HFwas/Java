package test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.Test;

/*
 * java.net.InetAddress：用来包装IP地址对象的
 * InetAddress有两个子类：Inet4Address 、Inet6Address 
 * 
 * (1)InetAddress.getLocalHost()
 * (2)InetAddress.getByName("www.baidu.com")
 * (3)InetAddress.getByAddress(addr)
 * 
 * 如果后面的API中，要接收IP的形参类型是InetAddress的话，就可以刚才的方法来创建对象
 */
public class TestInetAddress {
	@Test
	public void test03() throws UnknownHostException{
		byte[] addr = {(byte)192,(byte)168,30,(byte)142};
		InetAddress ben = InetAddress.getByAddress(addr);
		System.out.println(ben);
	}
	
	@Test
	public void test02() throws UnknownHostException{
		InetAddress bai = InetAddress.getByName("www.baidu.com");
		System.out.println(bai);
	}
	
	@Test
	public void test01() throws UnknownHostException{
		InetAddress ben = InetAddress.getLocalHost();
		System.out.println(ben);//Irene-PC/192.168.30.142
	}
}
