package com.example.chain_adapter_strategy.chain;

import com.example.chain_adapter_strategy.AbsAdapter;
import com.example.chain_adapter_strategy.ChargingRequest;
import com.example.chain_adapter_strategy.charingStrategy.IVoltageAbs;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ConcreteAdapterTo5V extends AbsAdapter {

    @Override
    public boolean process(ChargingRequest request) {
        if (Objects.isNull(request) || null == iVoltageAbs || iVoltageAbs.size() == 0){
            return Boolean.FALSE;
        }
        // 若不是当前适配器，则流转给下一个适配器
        if (request.getChargingVoltage() != 5){
            // 没有适配电源的情况
            if (null == nextAdapter){
                return Boolean.FALSE;
            }
            return nextAdapter.process(request);
        }
        // 若是当前适配器，则挑选5V电压转化器充电
        for (IVoltageAbs abs: iVoltageAbs) {
            if (abs.support(request.getChargingVoltage())){
                abs.coverVoltage();
                System.out.println("正在充电，充电电压是"+request.getChargingVoltage()+"V");
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
