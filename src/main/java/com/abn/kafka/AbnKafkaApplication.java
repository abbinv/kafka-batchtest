package com.abn.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@ComponentScan({"com.abn.kafka"})
public class AbnKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbnKafkaApplication.class, args);
    }
}