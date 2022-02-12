/*
运算符：
2、赋值运算符
（1）基本的赋值运算符：=

赋值操作：永远是把=右边的常量值、变量中值、表达式计算的值赋值给=左边的变量，
即=左边只能是一个变量。

运算的顺序：把右边的整个表达式先算完，才会做最后的赋值操作。

（2）扩展的赋值运算符
例如：
+=
-=
*=
/=
%=
...


*/
class Test09_Assign{
	public static void main(String[] args){
		int x = 1;
		int y = 2 ;
		int z = 3;
		//x + y = z;//=左边只能是一个变量
		
		byte b1 = 1;
		byte b2 = 2;
		//b2 = b1 + b2;//右边byte + byte结果是int
		b2 += b1;//等价于  b2 = (byte)(b2 + b1);
		System.out.println("b1 = " + b1);//1
		System.out.println("b2 = " + b2);
		
		System.out.println("---------------------------");
		int i = 1;
		int j = 5;
	
		j *= i++ + j;
		System.out.println("i = " +  i);//2
		System.out.println("j = " +  j);//30
	}
}