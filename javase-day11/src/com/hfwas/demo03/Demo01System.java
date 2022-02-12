package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2021/1/1
 * @Description: com.hfwas
 * java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用的方法有：
 *         public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
 *         public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：
 *                  将数组中指定的数据拷贝到另一个数组中。
 * @version: 1.0
 */
public class Demo01System {

    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /**
     * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：
     * 将src数组中前3个元素，复制到dest数组的前3个位置上
     *                 复制元素前：
     *                 src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
     *                 复制元素后：
     *                 src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
     */
    private static void demo02() {
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        //其实位置为0，赋值三个元素到目标数组当中，从目标数组小标为0开始
        System.arraycopy(src,0,dest,0,3);
        //1 2 3 9 10
        for (int i = 0; i < dest.length; i++) {
            System.out.print(dest[i] + " ");
        }
    }

    /**
     * public static long currentTimeMillis()
     * 测试程序的效率
     * 验证for循环打印数字1-9999所需要使用的时间（毫秒）
     */
    private static void demo01() {
        long start = System.currentTimeMillis();
        for (int i = 1; i < 9999; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("程序共耗时" + (end - start) + "毫秒");

    }

}
