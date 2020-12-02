import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Auther: HFwas
 * @Date: 2020/12/2
 * @Description: 演示synchronized可重入的特性
 * 1.自定义一个线程类
 * 2.在线程类的run()方法中使用嵌套的同步代码块
 * 3.使用两个线程来执行
 * @version: 1.0
 */
public class Demo01 {

    public static void main(String[] args) {
        new myThread().start();
        new myThread().start();
    }

}

//1.自定义一个线程类
class myThread extends Thread{
    @Override
    public void run() {
        synchronized (myThread.class){
            System.out.println(getName() + "线程进入了同步代码块1");
        }

        synchronized (myThread.class){
            System.out.println(getName() + "线程进入了同步代码块2");
        }
    }
}
