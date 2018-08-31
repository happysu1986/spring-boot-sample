package com.smiler.spring.boot.sample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by xile.su on 2018/8/31
 */
@Data
@Component
@ConfigurationProperties(prefix = "wisely")
@PropertySource("classpath:config/wisely.properties")
public class WiselySettings {

    private String name;

    private String gender;

}
