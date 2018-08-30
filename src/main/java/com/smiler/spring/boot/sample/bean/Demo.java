package com.smiler.spring.boot.sample.bean;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 * Created by xile.su on 2018/8/29
 */
@Data
@Entity
public class Demo {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Date createTime;
    private Date updateTime;
}
