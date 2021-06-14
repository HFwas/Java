package com.hfwas.jobtest.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class job {

    @Scheduled(cron = "*/1 * * * * ?")
    public void print(){
        int i = 0;
        System.out.println("数字：" +i);
    }

    public static void main(String[] args) {
        job job = new job();
        job.print();
    }

}
