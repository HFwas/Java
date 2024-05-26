package java.chapter13;

/**
 * @Author: HFwas
 * @Date: 2021/1/25
 * @Description: com.hfwas.java.chapter13
 * 使用intern()测试执行效率，空间使用上
 * 结论：对于程序中大量存在的字符串，尤其其中存在很多重复的字符串时，使用intern()可以节省内存空间
 * @version: 1.0
 */
public class StringIntern2 {
    static final int MAX_COUNT = 1000 * 10000;
    static final String[] arr = new String[MAX_COUNT];

    public static void main(String[] args) {
        Integer [] data = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        long start = System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
            //arr[i] = new String(String.valueOf(data[i%data.length]));
            arr[i] = new String(String.valueOf(data[i%data.length])).intern();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));

        try {
            Thread.sleep(1000000);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}