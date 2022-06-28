package com.example.SingleDog.chain;

import com.example.SingleDog.adapter.HumanAdapter;
import com.example.SingleDog.decorator.HasAbility;
import com.example.SingleDog.decorator.HasMoney;
import com.example.SingleDog.decorator.HumanDecorator;
import com.example.SingleDog.decorator.SimpleHuman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 秦同学
 */
@Component
public class NodeHandler5 extends AbstractHandler {

    @Autowired
    HumanAdapter humanAdapter;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public boolean process(SingleDogContext context) {
        System.out.println("===============================当前经历的阶段是" + this.getName());
        humanAdapter.newYour(context.getType());
        return true;
    }
}
