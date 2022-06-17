package com.example.palace;

import com.example.palace.chain.DirectorHandler;
import com.example.palace.chain.Manager;
import com.example.palace.chain.TopManager;
import com.example.palace.outline.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * TODO:doc
 *
 * @author jieyi
 * @version : Template.java, v 0.1 2022年06月15日 7:54 下午 jieyi Exp $
 */
@Component
public class Template {
    @Autowired
    Facade facade;
    public void build() {
        BuildPandasRequest.PandasHouse pandasHouse = new BuildPandasRequest.PandasHouse();
        pandasHouse.setHouseName("CiNingPandas");
        pandasHouse.setHouseShape("ConcreteBuilderHouseShape1");

        BuildPandasRequest.PandasHouse pandasHouse1 = new BuildPandasRequest.PandasHouse();
        pandasHouse1.setHouseName("KunNingPandas");
        pandasHouse1.setHouseShape("ConcreteBuilderHouseShape2");

        List<BuildPandasRequest.PandasHouse> pandasHouses = Arrays.asList(pandasHouse, pandasHouse1);
        BuildPandasRequest buildPandasRequest = new BuildPandasRequest(pandasHouses);


        DirectorHandler directorHandler = new DirectorHandler("一级管理者");
        Manager manager = new Manager("二级管理者");
        TopManager topManager = new TopManager("三级管理者");

        // 评审链路
        directorHandler.setNextHandler(manager);
        manager.setNextHandler(topManager);

        if(directorHandler.process(buildPandasRequest)){
            facade.handle(buildPandasRequest);
        }
    }
}
