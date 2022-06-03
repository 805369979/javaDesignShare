package com.example.dynamicScheduling;

/**
 * 秦同学
 */
public interface Handler {
    /**
     * 判断业务是否支持
     */
    boolean support(String bizCode);

    /**
     * 任务处理函数
     */
    void process(Param param);

}

