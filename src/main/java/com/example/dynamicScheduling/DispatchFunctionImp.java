package com.example.dynamicScheduling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 秦同学
 */
@Service
public class DispatchFunctionImp implements DispatchFunction<Boolean>{

    @Autowired
    List<Handler> handlerList;

    @Override
    public Boolean run(Param param) {
        if (!TypesEnum.MAP_CODE_2_ENUM.contains(param.getBizType())){
            return Boolean.FALSE;
        }
        // 判断任务是否运行成功
        boolean runFlag = Boolean.FALSE;

        for (Handler handler:handlerList) {
            if(handler.support(param.getBizType())){
                // 调度我们选择好的任务
                handler.process(param);
                // 设置任务成功标记位置
                runFlag = Boolean.TRUE;
            }
        }
        return runFlag;
    }
}
