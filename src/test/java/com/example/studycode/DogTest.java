package com.example.studycode;

import com.example.SingleDog.chain.*;
import com.example.StudyCodeApplication;
import com.example.chain_adapter_strategy.ChargingRequest;
import com.example.chain_adapter_strategy.Phone;
import com.example.chain_adapter_strategy.chain.ConcreteAdapterTo10V;
import com.example.chain_adapter_strategy.chain.ConcreteAdapterTo5V;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StudyCodeApplication.class)
public class DogTest {

    @Autowired
    NodeHandler1 nodeHandler1;
    @Autowired
    NodeHandler2 nodeHandler2;
    @Autowired
    NodeHandler3 nodeHandler3;
    @Autowired
    NodeHandler4 nodeHandler4;
    @Autowired
    NodeHandler5 nodeHandler5;

    String type;

    @Test
    public void testAnno(){

        // 意难平策略
        List<String> strategy = Arrays.asList("打球","跑步");
        // 领悟
        List<String> trait = Arrays.asList("自信心","心态");

        nodeHandler1.setName("节点1");
        nodeHandler2.setName("节点2");
        nodeHandler3.setName("节点3");
        nodeHandler4.setName("节点4");
        nodeHandler5.setName("节点5");

        SingleDogContext context = new SingleDogContext(type,strategy,trait);
        nodeHandler1.setNextHandler(nodeHandler2);
        nodeHandler2.setNextHandler(nodeHandler3);
        nodeHandler3.setNextHandler(nodeHandler4);
        nodeHandler4.setNextHandler(nodeHandler5);

        nodeHandler1.process(context);

    }
}
