package com.example.palace.outline;

import com.example.palace.Builder.Builder;
import com.example.palace.Builder.Director;
import com.example.palace.BuildPandasRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * TODO:doc
 *
 * @author jieyi
 * @version : CiNingPandas.java, v 0.1 2022年06月15日 6:29 下午 jieyi Exp $
 */
@Component
public class KunNingPandas implements BuilderHouse{

    @Autowired
    Director director;

    @Override
    public void process(BuildPandasRequest.PandasHouse request) {
        System.out.println("需要建造坤宁宫");
        director.construct(request);
    }

    @Override
    public boolean support(String request) {
        if (request.equals("KunNingPandas")){
            return true;
        }
        return false;
    }
}
