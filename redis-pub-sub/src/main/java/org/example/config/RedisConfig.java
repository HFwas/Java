package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RedisConfig {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
