package com.example.palace.Builder;

import com.example.palace.BuildPandasRequest;
import org.springframework.stereotype.Component;

/**
 * TODO:doc
 *
 * @author jieyi
 * @version : Builder.java, v 0.1 2022年06月15日 6:39 下午 jieyi Exp $
 */
@Component
public abstract class Builder {
    //创建产品对象
    protected PandasCompent compent = new PandasCompent();

    public abstract void buildCompont(BuildPandasRequest.PandasHouse house);
    //返回产品对象
    protected abstract boolean support(String name);
    public PandasCompent getCompont() {
        return compent;
    }
}
