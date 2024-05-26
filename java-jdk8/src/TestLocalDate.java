import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author HFwas
 * @Date 2022/2/11 9:20
 */
public class TestLocalDate {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        // 2022-02-11T09:22:08.364
        System.out.println(LocalDateTime.now());
        // 2021-12-11T09:22:08.364
        System.out.println(LocalDateTime.now().minusMonths(2L));
        // 2021-12-11 09:23:01
        System.out.println(LocalDateTime.now().minusMonths(2L).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        // 2022-02-09 09:23:52
        System.out.println(LocalDateTime.now().minusDays(2L).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));


    }
}
