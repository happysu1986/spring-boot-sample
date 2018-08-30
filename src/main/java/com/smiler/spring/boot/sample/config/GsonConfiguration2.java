package com.smiler.spring.boot.sample.config;

import com.smiler.spring.boot.sample.utils.GsonUtil;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

/**
 * Created by xile.su on 2018/8/29
 */
//@Configuration
public class GsonConfiguration2 {

    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        GsonHttpMessageConverter gsonConverter = new GsonHttpMessageConverter();
        gsonConverter.setGson(GsonUtil.gson);

        List<MediaType> supportedMediaTypes = new ArrayList<>();
        supportedMediaTypes.add(MediaType.APPLICATION_JSON);
        supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        supportedMediaTypes.add(MediaType.APPLICATION_FORM_URLENCODED);

        gsonConverter.setSupportedMediaTypes(supportedMediaTypes);

        HttpMessageConverter<?> converter = gsonConverter;
        return new HttpMessageConverters(converter);
    }
}
