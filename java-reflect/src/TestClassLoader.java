import org.junit.Test;

/*
 * 一、类加载的过程由类加载器来完成。
 * 类加载器：
 * 1、引导类加载器（Bootstrap Classloader）：又称为根类加载器
 * 	加载Java的核心库（JAVA_HOME/jre/lib/rt.jar等或sun.boot.class.path路径下的内容）
 * 是用原生代码（C/C++）来实现的，并不继承自java.lang.ClassLoder，所以通过Java代码获取引导类加载器对象将会得到null
 * 
 * 2、扩展类加载器（Extension ClassLoader）
 *  sun.misc.Launcher$ExtClassLoader
 * 负责加载Java的扩展库（JAVA_HOME/jre/ext/*.jar或java.ext.dirs路径下的内容） 
 * 
 * 3、应用程序类加载器（Application Classloader）
 * sun.misc.Launcher$AppClassLoader
 * 负责加载Java应用程序类路径（classpath、java.class.path）下的内容
 * 通俗的讲：项目的路径bin文件夹下的字节码，以及如果你配置了环境变量classpath
 * 
 * 4、自定义类加载器
 * 一般什么情况下需要自定义类加载器：
 * （1）字节码需要加密和解密
 * （2）字节码的路径不在常规路径，有自定特定的路径
 * 		例如：tomcat
 * 
 * 二、如何获取某个类的类加载器对象？
 * 1、获取某个类的Class对象
 * 2、通过Class对象调用getClassLoader()方法获取类加载器对象
 * 
 * 三、Java中类加载器的双亲委托模式
 * 1、类加载器设计时，这四种类加载器是有层次结构的，但是这层次结构不是通过继承关系来实现。
 * 但是是通过组合的方式，来实现“双亲”的认亲过程。
 * 例如：应用程序类加载器把扩展类加载器称为“父加载器”，在应用程序类加载器中保留应用程序类加载器的一个引用，成员变量，把变量名称设计为parent。
 * 所有的类加载器有一个getParent()，获取父加载器的方法。
 * 
 * 2、有什么用？
 * 目的：为了安全，而且各司其职
 * 
 * 当应用程序类加载器接到加载某个类的任务时，例如：java.lang.String。
 * （1）会现在内存中，搜索这个类是否加载过了，如果是，就返回这个类的Class对象，不去加载。
 * （2）如果没有找到，即没有加载过。会把这个任务先提交给“父加载器”
 * 
 * 当扩展类加载器接到加载某个类的任务时，例如：java.lang.String。
 * （1）会现在内存中，搜索这个类是否加载过了，如果是，就返回这个类的Class对象，不去加载。
 * （2）如果没有找到，即没有加载过。会把这个任务先提交给“父加载器”
 * 
 * 当引导类加载器接到加载某个类的任务时，例如：java.lang.String。
 * （1）会现在内存中，搜索这个类是否加载过了，如果是，就返回这个类的Class对象，不去加载。
 * （2）如果没有找到，即没有加载过。会在它的负责的范围内尝试加载。
 *    如果可以找到，那么就返回这个类的Class对象。就结束了。
 *    如果没有找到，那么会把这个任务往回传，让“子加载器”扩展类加载器去加载。
 *    
 *  “子加载器”扩展类加载器接到“父加载器”返回的任务后，去它负责的范围内加载。
 *    如果可以找到，那么就返回这个类的Class对象。就结束了。
 *    如果没有找到，那么会把这个任务往回传，让“子加载器”应用程序类加载器去加载。 
 * 
 * “子加载器”应用程序类加载器接到“父加载器”返回的任务后，去它负责的范围内加载。
 *    如果可以找到，那么就返回这个类的Class对象。就结束了。
 *    如果没有找到，那么就报错ClassNotFoundException或java.lang.NoClassDefError
 * 
 * Java中是认为不同的类加载器，加载的类名相同的类，识别为不同的类。
 * 
 */
public class TestClassLoader {
	@Test
	public void test04(){
		//(1)先获取这个类的Class对象
		Class clazz = TestClassLoader.class;
		//(2)获取它的类加载器对象
		ClassLoader loader = clazz.getClassLoader();
		System.out.println("当前类的加载器：" + loader);
		
		ClassLoader parent = loader.getParent();
		System.out.println("父加载器：" + parent);
		
		ClassLoader grand = parent.getParent();
		System.out.println("爷爷加载器：" + grand);
	}
	
	@Test
	public void test03() throws ClassNotFoundException{
		//(1)先获取这个类的Class对象
		Class clazz = Class.forName("com.atguigu.ext.demo.AtGuiguExtDemo");
		//(2)获取它的类加载器对象
		System.out.println(clazz.getClassLoader());
	}
	
	@Test
	public void test02(){
		//(1)先获取这个类的Class对象
		Class clazz = String.class;
		//(2)获取它的类加载器对象
		ClassLoader loader = clazz.getClassLoader();
		System.out.println(loader);
	}
	
	@Test
	public void test01(){
		//(1)先获取这个类的Class对象
		Class clazz = TestClassLoader.class;
		//(2)获取它的类加载器对象
		ClassLoader loader = clazz.getClassLoader();
		System.out.println(loader);
	}
}
