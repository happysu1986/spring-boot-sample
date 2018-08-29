package com.smiler.spring.boot.sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xile.su on 2018/8/29
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }
}
