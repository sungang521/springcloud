package com.sungang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.sungang.type2")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
