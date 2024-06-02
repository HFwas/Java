package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisPubSubController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/test")
    public void test() {
        redisTemplate.convertAndSend("test", "test");
    }
}
