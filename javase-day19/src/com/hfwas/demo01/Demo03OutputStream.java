package com.hfwas.demo01;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/1/8
 * @Description: com.hfwas.demo01
 * 追加写/续写:使用两个参数的构造方法
 *         FileOutputStream(String name, boolean append)创建一个向具有指定 name 的文件中写入数据的输出文件流。
 *         FileOutputStream(File file, boolean append) 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 *         参数:
 *            String name,File file:写入数据的目的地
 *            boolean append:追加写开关
 *             true:创建对象不会覆盖源文件,继续在文件的末尾追加写数据
 *             false:创建一个新文件,覆盖源文件
 *     写换行:写换行符号
 *         windows:\r\n
 *         linux:/n
 *         mac:/r
 * @version: 1.0
 */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Java\\GitRep\\JavaSE\\day19\\a.txt", true);
        fos.write("你好".getBytes());
//        fos.close();

        for (int i = 0; i < 10; i++) {
            fos.write("中国".getBytes());
        }

        for (int i = 0; i < 10; i++) {
            fos.write("中国".getBytes());
            //换行
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
