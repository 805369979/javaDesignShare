package com.example.SingleDog.chain;

import com.example.SingleDog.decorator.HasAbility;
import com.example.SingleDog.decorator.HasMoney;
import com.example.SingleDog.decorator.HumanDecorator;
import com.example.SingleDog.decorator.SimpleHuman;
import org.springframework.stereotype.Component;

/**
 * 秦同学
 */
@Component
public class NodeHandler4 extends AbstractHandler {

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public boolean process(SingleDogContext context) {
        System.out.println("===============================当前经历的阶段是" + this.getName());
        SimpleHuman simpleHuman = new SimpleHuman();
        HumanDecorator decoratorMoney = new HasMoney(simpleHuman);
        System.out.println(decoratorMoney.getYourself());
        HumanDecorator decoratorAbility = new HasAbility(simpleHuman);
        System.out.println(decoratorAbility.getYourself());

        // 设置是否重生
        context.setType("normal");
        return nextHandler.process(context);
    }
}
