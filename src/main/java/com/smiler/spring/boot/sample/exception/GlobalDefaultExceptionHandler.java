package com.smiler.spring.boot.sample.exception;

import com.smiler.spring.boot.sample.bean.Demo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xile.su on 2018/8/29
 */
@Slf4j
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Demo defaultErrorHandler(Exception e) {
        System.out.println("------------------------GlobalDefaultExceptionHandler------------------------");
        e.printStackTrace();

        Demo demo = new Demo();
        demo.setId(1);
        return demo;
    }
}
