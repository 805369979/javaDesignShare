package com.example.cache;

import lombok.Data;

/**
 * 秦同学
 */
@Data
public class Result<T> {
    // 方法运行时长
    Long runDuration;
    // 方法返回结果
    T result;
    // 方法参数
    T[] args;
    // 方法名称
    String name;

    // 调用时间
    String time;

}
