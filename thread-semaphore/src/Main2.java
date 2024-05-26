import java.util.concurrent.Phaser;
import java.util.concurrent.Semaphore;

public class Main2 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        new Thread(() -> {
            for (int i = 0, b = 1; i < 10; i++) {
                // 等待初始阶段，因为初始阶段是1，
                phaser.awaitAdvance(b);
                System.out.println("a");
                b = phaser.arrive() + 1;
            }
        }).start();

        new Thread(() -> {
            for (int i = 0, b = 0; i < 10; i++) {
                phaser.awaitAdvance(b);
                System.out.println("b");
                b = phaser.arrive() + 1;
            }
        }).start();

    }
}