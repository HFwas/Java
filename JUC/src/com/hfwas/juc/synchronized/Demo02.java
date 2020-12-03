/**
 * @Auther: HFwas
 * @Date: 2020/12/2
 * @Description: synchronized原理的学习
 * 1.通过反汇编的方式
 * 2.通过Java源码的方式
 * @version: 1.0
 */
public class Demo02 {

    private static  Object obj = new Object();

    public static void main(String[] args) {
        synchronized (obj){
            System.out.println("1111111");
        }
    }

    public synchronized  void test01(){
        System.out.println("222222222");
    }
}
