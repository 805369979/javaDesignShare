package com.example.palace.chain;

import com.example.palace.BuildPandasRequest;

/**
 * 秦同学
 */
public class Manager extends AbstractHandler {
    public Manager(String name) {
        super(name);
    }

    @Override
    public boolean process(BuildPandasRequest request) {
        System.out.println(name + "审批通过");
        return nextHandler.process(request);
    }
}
