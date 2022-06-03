package com.example.studycode.nodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * 洁祎
 */
@Component
public class Node extends StrategyTemplate<Param2, Param1> implements StrategyHandler<Param2, Param1> {
    @Autowired
    Node1 node1;
    @Autowired
    Node2 node2;
    @Override
    public Param1 apply(Param2 condition) {
        System.out.println("当前节点是Node");
        Param1 param1 = this.applyStrategy(condition);
        if (Objects.isNull(param1)){
            return null;
        }
        param1.setCondition1(800);
        return param1;
    }

    @Override
    protected StrategyMap<Param2, Param1> registerStrategyMapper() {
        return param -> {
            // 当条件1 大于条件2 时，移交到node1节点
            if (param.getCondition1() > param.getCondition2()) {
                return node1;
            }
            return node2;
        };
    }
}
