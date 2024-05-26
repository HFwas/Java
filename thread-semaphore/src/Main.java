import java.util.concurrent.Semaphore;

public class Main {
    private final static Semaphore semaphore = new Semaphore(1);
    private final static Semaphore semaphore2 = new Semaphore(0);
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    semaphore.acquire(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println('a');
                semaphore2.release();
            }
            semaphore.release();

        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    semaphore2.acquire(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println('b');
                semaphore.release();
            }
            semaphore.release();

        }).start();

    }
}