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
public class ConcreteBuilderHouseShape1 extends Builder{

    @Override
    public void buildCompont(BuildPandasRequest.PandasHouse house) {
        System.out.println(house.getHouseName()+"建造完成,使用的具体建造者是"+house.getHouseShape());
    }

          protected boolean support(String name) {
        if ("ConcreteBuilderHouseShape1".equals(name)){
            return true;
        }
        return false;
    }
}
