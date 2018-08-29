package com.smiler.spring.boot.sample.utils;

import static com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializer;
import java.util.Date;

/**
 * Created by xile.su on 2018/8/29
 */
public class GsonUtil {

    public static final Gson gson = new GsonBuilder()
        .serializeNulls()
        .setFieldNamingPolicy(LOWER_CASE_WITH_UNDERSCORES)
        .registerTypeAdapter(Date.class, (JsonSerializer<Date>) (json, typeOfSrc, context) -> new JsonPrimitive(json.getTime() / 1000))
        .registerTypeAdapter(Date.class, (JsonDeserializer<Date>) (je, type, jdc) -> je.getAsLong() == 0 ? null : new Date())
        .create();

}
