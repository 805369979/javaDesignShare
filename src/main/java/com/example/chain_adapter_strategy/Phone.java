package com.example.chain_adapter_strategy;

import lombok.Data;

@Data
public class Phone implements IVoltageInterface{

    AbsAdapter adapter;

    @Override
    public boolean process(ChargingRequest request) {
        System.out.println("开始寻找充电适配器");
        boolean process = adapter.process(request);
        System.out.println("正在充电,充电结果是"+process);
        return true;
    }
}
