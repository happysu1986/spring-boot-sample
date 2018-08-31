package com.smiler.spring.boot.sample.runner;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class MyStartupRunner1 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 1111<<<<<<<<<<<<<");

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
