package com.example.strategySelect.strategyTask;

import com.example.strategySelect.entity.Info;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractQuery {

    // 策略的处理功能
    abstract Info handle(String query);

    // 校验后台是否有策略功能
    abstract boolean queryType(StrategySelectEnum strategySelectEnum);
}
