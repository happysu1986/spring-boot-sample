package com.smiler.spring.boot.sample.scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by xile.su on 2018/8/30
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {

    @Scheduled(cron = "0/10 * * * * ?") // 每10秒执行一次
    public void scheduler() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(">>>>>>>>> SchedulingConfig.scheduler() --> " + sdf.format(new Date()));
    }
}
