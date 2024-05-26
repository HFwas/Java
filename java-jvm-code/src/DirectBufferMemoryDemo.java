import java.nio.ByteBuffer;

//-Xms10m -Xmx10m -XX:MaxDirectMemorySize=5m -XX:+PrintGCDetails
public class DirectBufferMemoryDemo {
    public static void main(String[] args) {
        System.out.println("配置的maxDirectMemory: " + (Runtime.getRuntime().maxMemory() / (double) 1024 / 1024) + "MB");
        try {
            Thread.sleep(300);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(6 * 1024 * 1024);
    }
}
