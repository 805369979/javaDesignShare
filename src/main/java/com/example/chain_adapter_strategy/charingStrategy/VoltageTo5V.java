package com.example.chain_adapter_strategy.charingStrategy;

import org.springframework.stereotype.Component;

@Component
public class VoltageTo5V implements IVoltageAbs {
    @Override
    public int coverVoltage() {
        return 5;
    }

    @Override
    public boolean support(int voltage) {
        if (voltage  == 5){
            return Boolean.TRUE;
        }
        return false;
    }
}
