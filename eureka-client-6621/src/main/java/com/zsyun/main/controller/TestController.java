package com.zsyun.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RequestMapping("/test")
@RestController
public class TestController {
    private final static String TEST_PROVIDER_PREFIX="http://EUREKA-PROVIDER-6611";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("")
    public String index() {
        return restTemplate.getForObject(TEST_PROVIDER_PREFIX + "/test", String.class);
    }
}
