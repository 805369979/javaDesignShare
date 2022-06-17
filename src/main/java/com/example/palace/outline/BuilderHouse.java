package com.example.palace.outline;

import com.example.palace.BuildPandasRequest;

/**
 * @author jieyi
 * @version : 2022.06.2022/6/15:17,BuilderHouse,v0.1
 */
public interface BuilderHouse {
    void process(BuildPandasRequest.PandasHouse request);
    boolean support(String request);
}
