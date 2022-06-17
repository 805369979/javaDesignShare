package com.example.palace.outline;

import com.example.palace.BuildPandasRequest;
import com.example.palace.Builder.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

/**
 * TODO:doc
 *
 * @author jieyi
 * @version : Facade.java, v 0.1 2022年06月15日 6:31 下午 jieyi Exp $
 */
@Component
public class Facade {

    // 获取所有的皇宫子建筑物的建设模板
    @Autowired
    private List<BuilderHouse> builderList;

    public void handle(BuildPandasRequest builderHouseList) {
        // 遍历需要建筑的皇宫建筑物
        for (BuildPandasRequest.PandasHouse house: builderHouseList.getHouse()){
            // 构建皇宫的组件
            BuilderHouse builderHousePandas = null;
             // 皇宫子建筑的名字
            String houseName = house.getHouseName();
            for (BuilderHouse builderHouse:builderList){
                if (builderHouse.support(houseName)){
                    builderHousePandas = builderHouse;
                }
            }
            // 不存在皇宫自建筑规划的情况
            if (Objects.isNull(builderHousePandas)) {
                continue;
            }
            builderHousePandas.process(house);
        }
    }
}
