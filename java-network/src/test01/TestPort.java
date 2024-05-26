package test01;

import org.junit.Test;

/*
 * 端口号：
 * 	[0,65535]之间无符号 2个字节
 * 
 * （1）公认端口（Well-Known Ports）范围从0到1023
 * 		http: 80  ftp:21  SMTP:25
 * （2）注册端口（Registered Ports）：端口号从1024到49151。
 * 		例如：Tomcat(8080)，JBOSS(8080)，Oracle（1521）,MySQL(3306)，SQL Server(1433)，QQ（1080）。
 * （3）动态/私有端口（Dynamic and/Private Ports）：端口的范围从49152到65535，这些端口号一般不固定分配给某个服务。
 */
public class TestPort {
	@Test
	public void test(){
		System.out.println(Short.MAX_VALUE);
		System.out.println(32767+32768);
	}
}
