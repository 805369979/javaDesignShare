package com.example.SingleDog.strategy;

import org.springframework.stereotype.Service;

/**
 * 秦同学
 */
@Service
public class IOneHandlerImpl2 extends IOneHandler {
    @Override
    public void doHandle(String type) {
        System.out.println("跑步缓减中");
    }

    @Override
    public boolean support(String type) {
        if (type.equals("跑步")){
            return true;
        }
        return false;
    }
}
