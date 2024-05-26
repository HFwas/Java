/*
 * 类的加载包含类的初始化一起完成：
 * （1）当虚拟机启动，先初始化main方法所在的类
 * （2）当初始化一个类，如果其父类没有被初始化，则先会初始化他的父类
 * （3）new一个对象
 * （4）使用一个类的静态的成员（包含静态变量和静态的方法），但是这个静态的变量不能是final
 * （5）使用java.lang.reflect包的方法对类进行反射调用
 */

class Father{
	static{
		System.out.println("main方法所在的类的父类(1)");
	}
}

public class TestClinit1 extends Father{
	static{
		System.out.println("main方法所在的类(2)");
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		new A();//第一次使用A就是创建它的对象
		
		B.test();
		
		Class clazz = Class.forName("com.atguigu.test02.C");
	}
}
class A{
	static{
		System.out.println("A类初始化");
	}
}
class B{
	static{
		System.out.println("B类初始化");
	}
	public static void test(){
		System.out.println("B类的静态方法");
	}
}
class C{
	static{
		System.out.println("C类初始化");
	}
}