package com.example.studycode.nodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jieyi,demin
 */
@Component
public class Node1 extends StrategyTemplate<Param2, Param1> implements StrategyHandler<Param2, Param1> {

    @Autowired
    Node4 node4;

    @Override
    public Param1 apply(Param2 condition) {
        System.out.println("node1节点");
        if (condition.getCondition2() == 200){
            Param1 param1 = new Param1();
            param1.condition2 = 300;
            return param1;
        }
        return this.applyStrategy(condition);
    }

    @Override
    protected StrategyMap<Param2, Param1> registerStrategyMapper() {
        return param -> param.getCondition2()== 200 ?  StrategyHandler.DEFAULT : node4;
    }
}
