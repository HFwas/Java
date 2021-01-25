package com.hfwas.java.chapter13;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/1/25
 * @Description: com.hfwas.java.chapter13
 * 产生10万个长度不超过10的字符串，包含a~z,A~Z
 * @version: 1.0
 */
public class GenerateString {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("1.txt");
        for (int i = 0; i < 1000000; i++) {
            int length = (int)(Math.random() * (10 - 1 + 1) + 1);
            fw.write(getString(length) + "\n");
        }

        fw.close();
    }

    private static String getString(int length) {
        String str = "";
        for (int i = 0; i < length; i++) {
            //65-90 97-122
            int num = (int)(Math.random() * (90 - 65 + 1) + 65) + (int)(Math.random() * 2) * 32;
            str += (char)num;
        }
        return str;
    }
}
