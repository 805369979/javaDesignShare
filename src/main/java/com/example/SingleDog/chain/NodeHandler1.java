package com.example.SingleDog.chain;

import com.example.SingleDog.state.Context;
import com.example.SingleDog.state.State;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 秦同学
 */
@Component
public class NodeHandler1 extends AbstractHandler {

    // 情绪状态上下文
    @Autowired
    Context moodContext;
    // 所有的情绪
    @Autowired
    List<State> states;

    public void setName(String name){
         this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public boolean process(SingleDogContext context) {
        System.out.println("===============================当前经历的阶段是"+this.getName());
        for (State state:states) {
            state.handle(moodContext);
        }
        return nextHandler.process(context);    }

}
