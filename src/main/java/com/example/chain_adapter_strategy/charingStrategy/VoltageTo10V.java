package com.example.chain_adapter_strategy.charingStrategy;

import org.springframework.stereotype.Component;

@Component
public class VoltageTo10V implements IVoltageAbs {
    @Override
    public int coverVoltage() {
        return 10;
    }

    @Override
    public boolean support(int voltage) {
        if (voltage == 10){
            return Boolean.TRUE;
        }
        return false;
    }
}
