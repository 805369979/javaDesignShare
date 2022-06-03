package com.example.strategySelect.strategyTask;

import com.example.strategySelect.entity.Info;
import com.example.strategySelect.util.ApplicationContextUtils;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.apache.commons.collections4.MapUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class QueryStrategyCenter {

     // 策略   策略bean   用户参数
    static Table<String, AbstractQuery,String> cache= HashBasedTable.create();

    // 调用入口
    public Boolean template(Map<StrategySelectEnum,String> selectCondition){
        selectAbstractQuery(selectCondition);
        return schedule(selectCondition);
    }

    private void  selectAbstractQuery(Map<StrategySelectEnum,String> selectCondition){
        if (MapUtils.isEmpty(selectCondition)){
            throw new RuntimeException("传入的策略选择不能为空");
        }
        // 拿到用户指定的策略枚举code
        List<String> strategySelectEnums1 = selectCondition.keySet().stream().map(StrategySelectEnum::getCode).collect(Collectors.toList());
        // 本地缓存中已经全部存在了用户指定的策略
        if(cache.rowKeySet().containsAll(strategySelectEnums1)){
            System.out.println("缓存中已经存在无需查找");
            return;
        }

        // 本地缓存不存在用户指定的策略
        Set<StrategySelectEnum> strategySelectEnums = selectCondition.keySet();
        for (StrategySelectEnum strategySelect: strategySelectEnums) {
            AbstractQuery bean = (AbstractQuery) ApplicationContextUtils.getBean(strategySelect.getCode());
            // 策略code 、策略处理类、用户参数
            cache.put(strategySelect.getCode(),bean,selectCondition.get(strategySelect));
        }
    }
    private Boolean  schedule(Map<StrategySelectEnum,String> selectCondition) {

        Set<Table.Cell<String, AbstractQuery, String>> cells = cache.cellSet();
        // 拿到用户指定的策略枚举code
        List<String> strategySelectEnums1 = selectCondition.keySet().stream().map(StrategySelectEnum::getCode).collect(Collectors.toList());

        try {
            for (Table.Cell<String, AbstractQuery, String> cell : cells) {
                // 只执行用户指定的策略
                if (strategySelectEnums1.contains(cell.getRowKey())){
                    System.out.println(cell.getRowKey() + " " + cell.getColumnKey() + " " + cell.getValue());
                    AbstractQuery columnKey = cell.getColumnKey();
                    Info handle = columnKey.handle(cell.getValue());
                    System.out.println(handle);
                }
            }
        }catch (Exception e){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
