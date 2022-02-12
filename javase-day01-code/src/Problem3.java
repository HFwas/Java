/*
问题3：格式问题（为了好看）
（1）{}问题
风格1：推荐风格
class 类名{
	方法{
		System.out.println();
	}
}

从右边往左边看，结尾要么是{，}，要么是;

风格2：延续老的C语言风格
class 类名
{
	方法
	{
		
	}
}
不建议混搭

风格3：不建议
class 类名{
	public static void main(String[] args){
		System.out.println("hello");		
										}}

（2）缩进问题
class 类名{
Tab键public static void main(String[] args){
Tab键Tab键System.out.println("xxx");
Tab键}
}		

往右缩进：Tab键
往左回缩：Shift + Tab键								
*/
class Problem3{
	public static void main(String[] args){
		System.out.println("xxx");

		for(int i=0; i<5; i++){
			System.out.println("yyy");
		}
	}
}