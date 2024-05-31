package com.service.mall.config;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThreadPoolConfig {
    @Bean
    ExecutorService threadPoolExecutor() {
        return Executors.newFixedThreadPool(10);
    }
}
