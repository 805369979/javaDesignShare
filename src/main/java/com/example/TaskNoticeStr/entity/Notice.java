package com.example.TaskNoticeStr.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 秦同学
 **/
@Data
public class Notice {

    public Map<String,Object> param = new HashMap<>();

    public void addParam(String key,Object o){
        this.param.put(key,o);
    }

    public void deleteParam(String key){
        this.param.remove(key);
    }

}
