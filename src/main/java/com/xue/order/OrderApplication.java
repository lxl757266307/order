package com.xue.order;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;
import redis.clients.jedis.JedisPool;

@EnableScheduling
@SpringBootApplication
@MapperScan("com.xue.order.dao")
@ComponentScan(basePackages = {"com.xue.order.*"})
public class OrderApplication {

    @Value("${spring.redis.host}")
    private String redisHost;

    @Value("${spring.redis.port}")
    private int redisPort;
    @Value("${spring.redis.password}")
    private String password;


    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(OrderApplication.class);
        Environment env = app.run(args).getEnvironment();
    }

    @Bean
    public JedisPool getJedisClient() {
        return new JedisPool(new GenericObjectPoolConfig(), redisHost, redisPort, 2000, password);
    }
}
