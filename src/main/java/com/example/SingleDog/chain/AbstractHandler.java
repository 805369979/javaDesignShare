package com.example.SingleDog.chain;

import lombok.Data;

/**
 * 责任链抽闲类
 */

@Data
public abstract class AbstractHandler {
    String name;
    protected AbstractHandler nextHandler;

    public abstract boolean process(SingleDogContext context);
}
