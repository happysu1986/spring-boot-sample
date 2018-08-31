package com.smiler.spring.boot.sample.controllers;

import com.smiler.spring.boot.sample.config.WiselySettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xile.su on 2018/8/31
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    private WiselySettings wiselySettings;


    @GetMapping("/test")
    public WiselySettings test() {
        return wiselySettings;
    }
}
