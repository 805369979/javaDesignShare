package com.example.SingleDog.chain;

import com.example.SingleDog.builder.ConcreteBuilder;
import com.example.SingleDog.builder.Direct;
import com.example.SingleDog.builder.Trait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 秦同学
 */
@Component
public class NodeHandler3 extends AbstractHandler {

    @Autowired
    Direct director;
    @Autowired
    ConcreteBuilder concreteBuilder;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public boolean process(SingleDogContext context) {
        System.out.println("===============================当前经历的阶段是" + this.getName());
        director.setBuilder(concreteBuilder);

        List<String> traits = context.getTrait();
        for (String trait : traits) {
            Trait construct = director.construct(trait);
            System.out.println(construct.toString());
        }
        return nextHandler.process(context);
    }
}
