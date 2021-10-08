package com.example.demo;
//package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
//        System.out.println("hello world");
        return "你好，SpringBoot hello world";
    }
}




