package com.example.cache;

import org.springframework.stereotype.Component;

/**
 * 秦同学
 */
@Component
public class EnhanceCache {
    @OrderTask(key = "getCode",prefix = "Pre")
    public String getCode(){
        return "myCode";
    }
    @OrderTask()
    public String getNames(){
        return "getNames";
    }

    @OrderTask()
    public String getNameWithArgs(String hh){
        return "getNameWithArgs";
    }

}
