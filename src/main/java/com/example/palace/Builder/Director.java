package com.example.palace.Builder;

import com.example.palace.BuildPandasRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * TODO:doc
 *
 * @author jieyi
 * @version : Director.java, v 0.1 2022年06月15日 6:38 下午 jieyi Exp $
 */
@Component
public class Director {

    // 获取所有的具体建造
    @Autowired
    private List<Builder> builder;

    //产品构建与组装方法
    public PandasCompent construct(BuildPandasRequest.PandasHouse house) {
        // 根据条件选择合适的具体建造者
        for (Builder build : builder){
            if (build.support(house.getHouseShape())){
                build.buildCompont(house);
                return build.getCompont();
            }
        }
        return null;
    }
}
