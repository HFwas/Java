class Test08_Exer8{
	public static void main(String[] args){
		short s = 5;
		//s = s-2;   //short - int，结果是int     
		
		byte b = 3;
      //  b = b + 4;    //byte + int，结果是int         
        b = (byte)(b+4);   //可以 
		
		char c = 'a';
		int  i = 5;
		float d = .314F;//非标准写法，如果整数部分是0，可以省略0，但不能省略小数点
		double result = c+i+d;   //char + int + float，结果是float，然后自动升级为double  
		
		
		byte b = 5;
		short s = 3;
		short t = (short) (s + b);  //short + byte，结果是int
	}
}