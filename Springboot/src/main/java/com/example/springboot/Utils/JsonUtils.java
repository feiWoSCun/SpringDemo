package com.example.springboot.Utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;

public class JsonUtils {
    public String getJson(Object obj) {
        String str = "yyyy-MM-dd HH:mm:ss";
        return getJson(obj, "yyyy-MM-dd HH:mm:ss");

    }
    public String getJson(Object obj, String dateformat) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateformat);
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setDateFormat(simpleDateFormat);
            return objectMapper.writeValueAsString(obj);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
