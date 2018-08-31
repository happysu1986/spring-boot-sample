package com.smiler.spring.boot.sample.environment;

import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 主要是@Configuration，实现接口：EnvironmentAware就能获取到系统环境信息;
 *
 * @version v.0.1
 * @authorAngel(QQ:412887952)
 */
@Component
public class MyEnvironmentAware implements EnvironmentAware {

    /**
     * 注意重写的方法 setEnvironment是在系统启动的时候被执行。
     */
    @Override
    public void setEnvironment(Environment environment) {

        //通过 environment获取到系统属性.
        System.out.println(environment.getProperty("JAVA_HOME"));

        //通过 environment同样能获取到application.properties配置的属性.
        System.out.println(environment.getProperty("spring.datasource.url"));

        //获取到前缀是"spring.datasource."的属性列表值.
        RelaxedPropertyResolver relaxedPropertyResolver = new RelaxedPropertyResolver(environment, "spring.datasource.");

        System.out.println("spring.datasource.url=" + relaxedPropertyResolver.getProperty("url"));
        System.out.println("spring.datasource.driverClassName=" + relaxedPropertyResolver.getProperty("driverClassName"));

    }

}