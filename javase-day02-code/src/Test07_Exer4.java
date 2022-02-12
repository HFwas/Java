/*
已知一个三位数，例如：483，如何用代码求出它的百位、十位、个位数
*/
class Test07_Exer4{
	public static void main(String[] args){
		int num = 483;
		
		int bai = num / 100;
		//int shi = num/10%10;
		int shi = num%100/10;
		int ge = num % 10;
		
		System.out.println(num + "的百位：" + bai + "，十位：" + shi +"，个位：" + ge);
	}
}