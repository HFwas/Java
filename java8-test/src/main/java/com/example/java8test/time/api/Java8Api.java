package com.example.java8test.time.api;

import java.time.*;

/**
 * @Author HFwas
 * @see {@link java.time.Instant,java.time.LocalDateTime,java.time.LocalDate,java.time.LocalTime,}
 * @Date 2022/2/11 9:28
 */
public class Java8Api {
    public static void main(String[] args) {
        Instant.now();
        LocalDate.now();
        LocalTime.now();
        LocalDateTime.now();
        Duration.ofDays(2L);


    }
}
