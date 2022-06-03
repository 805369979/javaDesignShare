package com.example.dynamicScheduling;

import org.springframework.stereotype.Service;

/**
 * 秦同学
 */
@Service
public class Task1 implements Handler {

    @Override
    public boolean support(String bizCode) {
        if (!TypesEnum.test1.getCode().equals(bizCode)){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override
    public void process(Param param) {
        System.out.println("task1任务运行");
    }
}
