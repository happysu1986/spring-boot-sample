package com.smiler.spring.boot.sample.controllers;

import com.smiler.spring.boot.sample.bean.Demo;
import com.smiler.spring.boot.sample.scheduling.SchedulingConfig;
import com.smiler.spring.boot.sample.utils.ApplicationContextHolder;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xile.su on 2018/8/29
 */
@RestController
@RequestMapping("/demo")
@Slf4j
public class DemoController {

    @RequestMapping("/getDemo")
    public Demo getDemo() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Angel");
        demo.setCreateTime(new Date());
        demo.setUpdateTime(new Date());
        return demo;
    }

    @GetMapping()
    public Demo getDemo(Demo demo) {
        return demo;
    }

    @PostMapping()
    public Demo postDemo(@RequestBody Demo demo) {
        return demo;
    }

    @GetMapping("/exception")
    public Demo exception() {

        log.info("100/0= {}", 100 / 0);
        return getDemo();
    }

    @GetMapping("/bean")
    public Boolean testBean() {
        return ApplicationContextHolder.getBean(SchedulingConfig.class) != null;
    }

    @GetMapping("/html")
    public String html(){
        return "/test.html";
    }
}
