package com.hfwas;

/**
 * @Auther: HFwas
 * @Date: 2020/12/6
 * @Description: 数据类型转换
 * @version: 1.0
 */
public class DataTypeConversion {
    /*
        当数据类型不一致时，将会发生数据类型转换，分为两种
        自动类型转换(隐式)：
            1.特点：代码不需要进行特殊处理，自动完成
            2.规则:数据类型从小到大
        强制类型转换(显示)：
            1.特点：代码需要进行特殊的格式处理，不能自动完成转换
            2.格式：范围小的数据类型 变量名 = (范围小的数据类型)原本范围大的数据
        注意事项:
            1.强制类型转换一般不推荐使用，因为有可能发生精度损失，数据溢出
            2.byte/short/char这三种数据类型都可以发生数学运算，例如："+"
            3.byte/short/char这三种数据类型在发生数学运算时，先被提升为Int类型，然后在计算
            4.布尔数据类型不能发生数据转换
     */
    public static void main(String[] args) {
        System.out.println(10.0);//默认时double类型
        System.out.println(99);//默认时Int类型

        //自动数据类型转换
        long num = 89;//左侧时Int类型，右侧是long类型，符合从小到大的规则，完成了自动类型转换
        System.out.println(num);

        double num2 = 1.7F;
        System.out.println(num2);//float到double，也发生了自动类型转换

        //强制类型转换
        //左侧时Long，右侧时int，不能自动完成类型转换
        int num3 = (int) 77L;
        System.out.println(num3);

        float num4 = (float) 8.39;
        System.out.println(num4);

        int fl = (int) 6000000000L;//会造成数据溢出
        System.out.println(fl);//1705032704

        int num5 = (int)9.9;//double->int
        System.out.println(num5);//9

        char ch = 'A';
        //计算机的底层会用一个数字(二进制)来代表A，就是65
        //一旦char类型的变量进行了数学运算，就会依照一定的规则翻译成一个数字
        System.out.println(ch + 1);//A被当作65处理了

        byte byte1 = 40;
        byte byte2 = 20;
        //byte result = byte1 + byte2;//会报错，因为+运算，会先将byte提升至int,得到一个int值，再赋值给byte，
        //byte + byte -> int
        int result = byte1 + byte2;
        System.out.println(result);

    }
}
