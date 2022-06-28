package com.example.SingleDog.strategy;

import javax.annotation.Resource;

/**
 * 秦同学
 */
public abstract class IOneHandler {
    public abstract void doHandle(String type);
    public abstract boolean support(String type);

}
