package com.example.SingleDog.chain;

import com.example.SingleDog.strategy.IOneHandler;
import com.example.SingleDog.strategy.OneHandlerContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 秦同学
 */
@Component
public class NodeHandler2 extends AbstractHandler {

    @Autowired
    OneHandlerContext oneHandlerContext;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public boolean process(SingleDogContext context) {
        System.out.println("===============================当前经历的阶段是"+this.getName());
        List<String> strategy = context.getStrategy();
            for (String rule:strategy){
                oneHandlerContext.executeStrategy(rule);
            }
        return nextHandler.process(context);
    }

}
