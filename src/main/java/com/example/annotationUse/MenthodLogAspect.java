package com.example.annotationUse;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 秦同学
 */
@Aspect
@Component
@Slf4j
public class MenthodLogAspect {
    @SneakyThrows
    //标注ClassMenthodLog注解的方法均会调用此方法
    @Around("@annotation(com.example.annotationUse.ClassMenthodAuthLog)")
    public Object processPerform(ProceedingJoinPoint point) {

        ClassMenthodAuthLog annotation = AnnotationUtils.getAnnotation(((MethodSignature) point.getSignature()).getMethod(), ClassMenthodAuthLog.class);
        String methodLog = annotation.logInfo();
        String auth = annotation.auth();
        Object[] args = point.getArgs();
        System.out.println("=========================");
        Arrays.stream(args).forEach(System.out::println);
        String paramValue = (String)args[0];
        // 模拟鉴权
        Boolean aBoolean = authCheck(paramValue,auth);
        if (!aBoolean){
            throw new RuntimeException("没有权限");
        }
        log.info(methodLog+"#"+paramValue);
        Object proceed = point.proceed();
        log.info(methodLog+"#"+paramValue+"执行完成");

        return proceed;
    }

    public Boolean authCheck(String param,String name){
        // 数据库中检查
//        return false;
        return true;
    }


}
