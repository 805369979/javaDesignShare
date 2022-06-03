package com.example.strategySelect.strategyTask;

import com.example.strategySelect.entity.Info;
import org.springframework.stereotype.Component;

@Component("GoodDataQuery")
public class GoodDataQuery extends AbstractQuery {

    @Override
    Info handle(String query) {
        Info info = new Info();
        info.setGoodName("GOOD");
        System.out.println("查询参数是："+query+"   GoodDataQuery处理完成,返回结果");
        return info;
    }

    @Override
    boolean queryType(StrategySelectEnum strategySelectEnum) {
        return StrategySelectEnum.GOOD_QUERY.code.equals(strategySelectEnum.getCode());
    }
}
