package com.smiler.spring.boot.sample.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xile.su on 2018/8/30
 */
@RestController
@RequestMapping("/template")
public class TemplateController {

    /**
     * 返回html模板.
     */
    @RequestMapping("/helloHtml")
    public ModelAndView helloHtml() {
        Map<String, Object> model = new HashMap<>();
        model.put("hello", "fromTemplateController.helloHtml");
        return new ModelAndView("helloHtml", model);
    }

    @RequestMapping("/helloFtl")
    public ModelAndView helloFtl() {
        Map<String, Object> model = new HashMap<>();
        model.put("hello", "fromTemplateController.helloFtl");
        return new ModelAndView("helloFtl", model);
    }
}
