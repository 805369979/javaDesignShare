package com.example.dynamicScheduling;

import org.springframework.stereotype.Service;

/**
 * 秦同学
 */
@Service
public class Task implements Handler {

    /**
     * @param bizCode  业务code
     * @return
     */
    @Override
    public boolean support(String bizCode) {
        if (!TypesEnum.test.getCode().equals(bizCode)){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override
    public void process(Param param) {
        System.out.println("task任务运行");
    }
}
