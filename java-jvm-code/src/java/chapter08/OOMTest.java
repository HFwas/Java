package java.chapter08;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: HFwas
 * @Date: 2021/1/22
 * @Description: com.hfwas.java.chapter08
 * -Xms600m -Xmx600m
 * @version: 1.0
 */
public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(1024*1024)));
        }
    }
}

class Picture{
    private byte[] pixels;

    public Picture(int length){
        this.pixels = new byte[length];
    }
}

