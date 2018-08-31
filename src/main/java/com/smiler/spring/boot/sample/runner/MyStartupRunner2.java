package com.smiler.spring.boot.sample.runner;

import java.util.Arrays;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 0)
public class MyStartupRunner2 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 2222<<<<<<<<<<<<<");
        print(args);
    }

    private void print(String... args) {
        if (args == null) {
            System.out.println("null");
        } else {
            System.out.println(Arrays.asList(args).toString());
        }
    }
}
