package com.rishabh.springcloud.apigateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class RedisRateLimitConfig {
    @Bean
    KeyResolver userKeyResolver()
    {
        return exchange -> Mono.just("userKey");
    }
}
