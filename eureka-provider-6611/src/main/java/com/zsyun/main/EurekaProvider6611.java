package com.zsyun.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaProvider6611 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider6611.class, args);
    }
}
