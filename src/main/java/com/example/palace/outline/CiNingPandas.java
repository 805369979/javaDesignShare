package com.example.palace.outline;

import com.example.palace.BuildPandasRequest;
import com.example.palace.Builder.Director;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * TODO:doc
 *
 * @author jieyi
 * @version : CiNingPandas.java, v 0.1 2022年06月15日 6:29 下午 jieyi Exp $
 */
@Component
public class CiNingPandas implements BuilderHouse{

    // 建造建筑的指挥者，用于选择具体的建造过程
    @Autowired
    Director director;

    @Override
    public void process(BuildPandasRequest.PandasHouse request) {
        System.out.println("需要建造慈宁宫");
        // 开始建造
        director.construct(request);
    }

    @Override
    public boolean support(String request) {
        if (request.equals("CiNingPandas")){
            return true;
        }
        return false;
    }
}
