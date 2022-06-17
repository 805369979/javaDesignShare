package com.example.palace.Builder;

import com.example.palace.BuildPandasRequest;
import org.springframework.stereotype.Component;

/**
 * TODO:doc
 *
 * @author jieyi
 * @version : ConcreteBuilderPandas1.java, v 0.1 2022年06月15日 6:41 下午 jieyi Exp $
 */
@Component
public class ConcreteBuilderHouseShape2 extends Builder{

    @Override
    public void buildCompont(BuildPandasRequest.PandasHouse house) {
        System.out.println("Pandas2建造完成"+house.getHouseShape());
    }

    @Override
    protected boolean support(String name) {
        if ("ConcreteBuilderHouseShape2".equals(name)){
            return true;
        }
        return false;
    }
}
