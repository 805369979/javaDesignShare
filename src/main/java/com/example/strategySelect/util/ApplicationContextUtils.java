package com.example.strategySelect.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


/**
 * 秦同学
 */
@Component("applicationContextUtils")
public class ApplicationContextUtils implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    /**
     * 根据bean name 获取对应的 bean
     */
    public static <T> T getBean(String beanName, Class<T> clazz) {
        return applicationContext.getBean(beanName, clazz);
    }

    /**
     * 根据bean clazz 获取对应的 bean
     */
    public static <T> T getBean(Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }

    /**
     * 根据bean clazz 获取对应的 bean
     */
    public static <T> T getBean(String beanName) {
        return (T)applicationContext.getBean(beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextUtils.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

}
