package org.example.listener;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

@Configuration
public class RedisListener implements MessageListener {
    @Override
    public void onMessage(Message message, byte[] pattern) {
        System.out.println(message);
    }
}
