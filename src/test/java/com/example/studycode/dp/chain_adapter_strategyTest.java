package com.example.studycode.dp;

import com.example.StudyCodeApplication;
import com.example.chain_adapter_strategy.Phone;
import com.example.chain_adapter_strategy.ChargingRequest;
import com.example.chain_adapter_strategy.chain.ConcreteAdapterTo10V;
import com.example.chain_adapter_strategy.chain.ConcreteAdapterTo5V;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StudyCodeApplication.class)
public class chain_adapter_strategyTest {

    @Autowired
    ConcreteAdapterTo5V concreteAdapterTo5V;

    @Autowired
    ConcreteAdapterTo10V concreteAdapterTo10V;

    @Test
    public void testAnno(){

        ChargingRequest request = new ChargingRequest(20);
        concreteAdapterTo5V.setNextAdapter(concreteAdapterTo10V);

        Phone phone = new Phone();
        phone.setAdapter(concreteAdapterTo5V);
        phone.process(request);

    }
}
