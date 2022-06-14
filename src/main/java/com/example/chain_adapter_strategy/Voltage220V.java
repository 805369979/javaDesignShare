package com.example.chain_adapter_strategy;

/**
 * 基础充电 相当于电源插座，提供220V的电压
 */
public class Voltage220V {
    // 输出220V电压
    public int output220V() {
        int src = 220;
        System.out.println("电压:" + src + "V");
        return src;
    }
}
