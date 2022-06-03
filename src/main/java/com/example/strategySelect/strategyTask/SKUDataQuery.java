package com.example.strategySelect.strategyTask;

import com.example.strategySelect.entity.Info;
import com.example.strategySelect.entity.SonInfo;
import org.springframework.stereotype.Component;

@Component("SKUDataQuery")
public class SKUDataQuery extends AbstractQuery {

    @Override
    Info handle(String query) {
        SonInfo sonInfo = new SonInfo();
        sonInfo.setType("SKU");
        System.out.println("查询参数是："+query+"    SKUDataQuery处理完成,返回结果");
        return sonInfo;
    }

    @Override
    boolean queryType(StrategySelectEnum strategySelectEnum) {
        return StrategySelectEnum.ITEM_QUERY.code.equals(strategySelectEnum.getCode());
    }
}
