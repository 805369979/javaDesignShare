package com.example.dp.chain;

/**
 * 秦同学
 */
public class TopManager extends AbstractHandler {
    public TopManager(String name) {
        super(name);
    }

    @Override
    public boolean process(LeaveRequest request) {
        System.out.println(name + "审批通过");
        return true;
    }
}
