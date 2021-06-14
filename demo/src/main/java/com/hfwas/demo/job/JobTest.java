package com.hfwas.demo.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务配置类
 */
@Component
public class JobTest {


//    @Scheduled(fixedRate = 1000L)
    @Scheduled(cron = "0/1 * * * * *")
//    @Scheduled(fixedDelay = 8989L)
//    @Scheduled(fixedDelayString = "")
    public void print(){
        System.out.println("当前时间为" + System.currentTimeMillis() );
    }

}
