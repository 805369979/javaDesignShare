package com.example.SingleDog.strategy;

import org.springframework.stereotype.Service;

/**
 * 秦同学
 */
@Service
public class IOneHandlerImpl1 extends IOneHandler {

    @Override
    public void doHandle(String type) {
        System.out.println("打球缓减中");
    }

    @Override
    public boolean support(String type) {
        if (type.equals("打球")){
            return true;
        }
        return false;
    }
}
