package com.example.dp.chain;

import lombok.Data;

/**
 * 责任链抽闲类
 */

@Data
public abstract class AbstractHandler {
    protected String name;
    protected AbstractHandler nextHandler;

    public AbstractHandler(String name) {
        this.name = name;
    }

    public abstract boolean process(LeaveRequest request);
}
