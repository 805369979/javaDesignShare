package com.example.studycode.nodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jieyi,demin
 */
@Component
public class Node2 extends StrategyTemplate<Param2, Param1> implements StrategyHandler<Param2, Param1> {

    @Autowired
    Node3 node3;

    @Override
    public Param1 apply(Param2 condition) {
        System.out.println("当前节点是node2");
        if (condition.getCondition2() == 300){
            Param1 param1 = new Param1();
            param1.setCondition2(300);
            return param1;
        }
        Param1 param1 = this.applyStrategy(condition);
        return param1;
    }

    @Override
    protected StrategyMap<Param2, Param1> registerStrategyMapper() {
        return param -> param.getCondition2()==200 ? node3:StrategyHandler.DEFAULT ;
    }
}
