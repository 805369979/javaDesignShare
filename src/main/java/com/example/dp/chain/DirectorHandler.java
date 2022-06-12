package com.example.dp.chain;

/**
 * 秦同学
 */
public class DirectorHandler extends AbstractHandler {

    public DirectorHandler(String name) {
        super(name);
    }

    @Override
    public boolean process(LeaveRequest request) {
        System.out.println(name + "审批通过");
        return nextHandler.process(request);
    }
}
