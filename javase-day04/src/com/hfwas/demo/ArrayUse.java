package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/9
 * @Description: 数组使用
 * @version: 1.0
 */
public class ArrayUse {
    /*
        数组使用：
            使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值。规则如下：
                1.如果是整数类型，那么默认为0；
                2.如果是浮点类型，那么默认为0.0
                3.如果是字符类型，那么默认为'\u0000'
                4.如果是Boolean类型，那么默认为false
                5.如果是引用类型，那么默认为null
        注意事项：
            静态初始化其实也有默认值的过程，只不过系统自动化马上将默认值替换称为了大括号当中的具体数值

        所有的引用类型变量，都可以赋值为一个Null值，但是代表其中什么也没有

        数组一旦创建，程序运行期间，长度不可改变
        数组可以作为方法参数，当调用方法的时候，向方法的小括号进行传参，传递进去的是数组的地址值
     */
    public static void main(String[] args) {
        int[] num = new int[3];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        System.out.println(num);
        System.out.println(num[0]);

        int[] num2 = new int[3];
        System.out.println(num2);
        for (int i = 0; i < 3; i++) {
            System.out.println(num2[i]);//0
        }

        num2[0] = 12;
        System.out.println(num2[0]);

        //数组越界异常
        //错误写法
        //System.out.println(num2[3]);//ArrayIndexOutOfBoundsException

        int[] array = null;
        //System.out.println(array[0]);//NullPointerException
        //array = new int[3];

        //获取数组的长度
        int[] num3 = new int[10];
        int[] num4 = {1,2,3,3,5,48,8,7,8};
        System.out.println(num3.length);
        System.out.println(num4.length);

        //数组的遍历输出
        printArray(num4);

        num4 = new int[56];
        System.out.println(num4.length);

        //求出数组当中的最大值
        int[] num5 = new int[]{1,2,3,9,8,4,6};
        int max = 0;
        for (int i = 0; i < num5.length; i++) {
            if (num5[i] > max){
                max = num5[i];
            }
        }
        System.out.println("最大值" + max);

        //数组元素反转
        //本来[1,2,3,4]
        //反转之后[4,3,2,1]
        int[] num6 = new int[]{1,2,3,4,5};
        int begin = 0;
        int end = num6.length - 1;
        for (int i = 0; i < num6.length; i++) {
            int tmp = 0;
            while (begin < end){
                tmp = num6[end];
                num6[end] = num6[begin];
                num6[begin] = tmp;
                begin++;
                end--;
            }
        }
        //打印数组
        printArray(num6);//传递进去的是num6当中保存的地址值

        //方法返回值是数组
        int[] ints = get(1, 2, 3);
        System.out.println("总额：" + ints[0]);
        System.out.println("平均数：" + ints[1]);

    }

    public static void printArray(int[] num) {
        //输出
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static int[] get(int a,int b,int c){
        int sum = a + b + c;
        int avg = sum / 3;
        int[] num = new int[]{sum,avg};
        return num;
    }

}
