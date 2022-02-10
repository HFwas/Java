package com.hfwas.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Test
    int contextLoads() {
        List<String> list = Arrays.asList("2", "1", "3", "42", "34", "23");
        String result = "";
        for (String s : list) {
            if (s.length() > 1) {
                int length = s.length();
                return length;
            }
            return -1;
        }
        return -1;
    }

}
