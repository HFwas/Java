package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/10
 * @Description: 面向对象三大特征：封装，继承，多态
 * 封装在方法中的体现：
 *  1.方法就是一种封装
 *  2.关键字private就是一种封装
 * 封装就是将一些细节信息隐藏起来，对于外界不可见。一旦使用了private进行修饰，那么本类当中仍然可以随意访问
 * 但是！超出了本类范围之外就不能再直接访问了，间接访问private成员变量，就是定义一对Getter/Setter方法
 * 必须交setxx或者是getXxx命名规则。
 * 对于Getter来说，不能有参数，返回值类型和成员变量对应
 * 对于Setter来说，有参数
 *
 * 构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就再调用构造方法
 *  格式：public 类名称(参数类型 参数名){
 *      方法体;
 *  }
 *  注意事项：
 *      1.构造方法的名称必须和所在的类名称完全一样，就连大小写也一样
 *      2.构造方法不要写返回类型
 *      3.构造方法不能return一个具体的返回值
 *      4.如果没有编写任何构造方法，编译器会免费赠送一个构造方法，没有参数，什么也不做
 *      5.一旦编写了至少一个构造方法，那么编译器将不再赠送
 * 构造方法也可以重载
 * @version: 1.0
 */
public class Method {

    String name;
    int age;

    public static void main(String[] args) {
        int[] num = new int[]{ 10,2,6,9,20 };

        int max = getMax(num);
        System.out.println("最大值:"+max);

        //private测试
        Person person = new Person();
        person.setAge(-20);
        person.name = "黄渤";
        person.show();

        Method method = new Method();//构造方法执行了

        Method method1 = new Method("赵丽颖",15);
    }

    public Method(){
        System.out.println("构造方法执行了");
    }

    public Method(String name,int age){
        System.out.println("全参构造方法执行了");
        this.age = age;
        this.name = name;
    }

    public static int getMax(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }

}
