/*
 * 类的加载过程中，没有带上类的初始化：
 * （1）引用静态常量不会触发此类的初始化
 * （2）当访问一个静态域（静态变量，静态方法）时，只有真正声明这个域的类才会被初始化
	即当通过子类引用父类的静态变量，静态方法时，不会导致子类初始化
 * （3）通过数组定义类引用，不会触发此类的初始化
 *
 */
public class TestClinit2 {
	public static void main(String[] args) {
		System.out.println(D.NUM);//D类不会初始化，因为NUM是final的
		
		System.out.println(F.num);
		F.test();//F类不会初始化，E类会初始化，因为num和test()是在E类中声明的
		
		//G类不会初始化，此时还没有正式用的G类
		G[] arr = new G[5];//没有创建G的对象，创建的是准备用来装G对象的数组对象
	}
}
class D{
	public static final int NUM = 10;
	static{
		System.out.println("D类的初始化");
	}
}
class E{
	static int num = 10;
	static{
		System.out.println("E父类的初始化");
	}
	public static void test(){
		System.out.println("父类的静态方法");
	}
}
class F extends E{
	static{
		System.out.println("F子类的初始化");
	}
}

class G{
	static{
		System.out.println("G类的初始化");
	}
}