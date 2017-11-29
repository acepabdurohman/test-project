package com.acepabdurohman.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "hello world";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello jenkins";
    }
}
