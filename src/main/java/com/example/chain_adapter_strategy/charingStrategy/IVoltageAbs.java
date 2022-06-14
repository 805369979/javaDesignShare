package com.example.chain_adapter_strategy.charingStrategy;

public interface IVoltageAbs {
    int coverVoltage();
    boolean support(int voltage);
}
