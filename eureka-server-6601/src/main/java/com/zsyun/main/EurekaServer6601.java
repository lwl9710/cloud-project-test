package com.zsyun.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer6601 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer6601.class, args);
    }
}
