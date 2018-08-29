package com.smiler.spring.boot.sample.bean;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.Date;
import lombok.Data;

/**
 * Created by xile.su on 2018/8/29
 */
@Data
public class Demo {

    private Integer id;
    private String name;
    @JSONField(format = "yyyy-MM-dd-HH:mm:ss")
    private Date createTime;
    private Date updateTime;
}
