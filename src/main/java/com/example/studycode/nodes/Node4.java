package com.example.studycode.nodes;

import org.springframework.stereotype.Component;

/**
 * @author jieyi,demin
 */
@Component
public class Node4 extends StrategyTemplate<Param2, Param1> implements StrategyHandler<Param2, Param1> {

    @Override
    public Param1 apply(Param2 condition) {
        System.out.println("当前节点是node4");
        if (condition.getCondition2() == 300){
            Param1 param1 = new Param1();
            param1.setCondition2(300);
            return param1;
        }
        return this.applyStrategy(condition);
    }

    @Override
    protected StrategyMap<Param2, Param1> registerStrategyMapper() {
        return param -> StrategyHandler.DEFAULT;
    }
}
