package com.zsyun.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("")
    public String index() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
        return "["+ simpleDateFormat.format(new Date()) +"]>>>>>>您当前正在访问测试接口！";
    }
}
