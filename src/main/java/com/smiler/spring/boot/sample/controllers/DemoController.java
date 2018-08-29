package com.smiler.spring.boot.sample.controllers;

import com.smiler.spring.boot.sample.bean.Demo;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xile.su on 2018/8/29
 */
@RestController
@RequestMapping("/demo")
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
}
