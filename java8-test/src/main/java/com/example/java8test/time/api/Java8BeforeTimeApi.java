package com.example.java8test.time.api;

import java.time.Instant;

/**
 * @Author HFwas
 * @Date 2022/2/11 9:25
 */
public class Java8BeforeTimeApi {
    public static void main(String[] args) {
        testInstant();
    }

    private static void testInstant() {
        // 2022-02-11T01:25:02.896Z
        Instant now = Instant.now();
        System.out.println(now);

    }
}
