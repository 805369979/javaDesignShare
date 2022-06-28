package com.example.SingleDog.state;

import org.springframework.stereotype.Component;

/**
 * 秦同学
 */
@Component
public class StateImpl2 implements State {
    @Override
    public void handle(Context context){
        System.out.println("迷茫");
        context.setState(this);
    }
}
