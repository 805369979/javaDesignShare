package com.example.SingleDog.strategy;

import com.google.common.collect.Maps;
import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * 秦同学
 */
@Service
@Data
public class OneHandlerContext {
    @Autowired
    List<IOneHandler> handlers;

    public void executeStrategy(String type){
        for (IOneHandler handler:handlers)
        {
            if (handler.support(type)){
                handler.doHandle(type);
            }
        }
    }

}
