package com.hfwas.demo04;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/1/8
 * @Description: com.hfwas.demo04
 * 续写和换行
 *     续写,追加写:使用两个参数的构造方法
 *         FileWriter(String fileName, boolean append)
 *         FileWriter(File file, boolean append)
 *         参数:
 *             String fileName,File file:写入数据的目的地
 *             boolean append:续写开关 true:不会创建新的文件覆盖源文件,可以续写; false:创建新的文件覆盖源文件
 *      换行:换行符号
 *         windows:\r\n
 *         linux:/n
 *         mac:/r
 * @version: 1.0
 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\Java\\GitRep\\JavaSE\\day19\\1.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("helloworld" + i + "\r\n");
        }

        fw.flush();
        fw.close();
    }
}
