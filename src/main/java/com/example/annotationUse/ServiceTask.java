package com.example.annotationUse;

import org.springframework.stereotype.Component;

/**
 * 秦同学
 */
@Component
public class ServiceTask {

    // 定义注解
    @ClassMenthodAuthLog(logInfo = "ServiceTask#getData",auth="user")
    public Object getData(String param){
        System.out.println("正常业务逻辑被执行");
        return param+"执行成功";
    }
}
