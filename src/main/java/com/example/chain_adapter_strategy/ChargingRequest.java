package com.example.chain_adapter_strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
  *  充电请求
 */
@Data
@AllArgsConstructor
public class ChargingRequest {
    private int chargingVoltage;
}
