package com.example.SingleDog.state;

import org.springframework.stereotype.Component;

/**
 * 秦同学
 */
@Component
public class StateImpl1 implements State {

    @Override
    public void handle(Context context) {
        System.out.println("痛苦");
        context.setState(this);
    }
}
