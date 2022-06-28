package com.example.cache;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

/**
 * 秦同学
 */
@Slf4j
@Component
@Aspect
public class AopProcess {

    @Autowired
    CacheManage cacheManage;
    /**
     * 环绕增强
     */
    @Around("@annotation(com.example.cache.OrderTask)")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long start = System.currentTimeMillis();
        log.info("开始执行 AOP");
        MethodSignature signature = ((MethodSignature) point.getSignature());
        OrderTask annotation = signature.getMethod().getAnnotation(OrderTask.class);

        // 没有注解的话就直接执行
        if (annotation == null){
            return point.proceed();
        }

        String key = annotation.key();
        String prefix = annotation.prefix();

        // 运行目标方法
        Object proceed = point.proceed();

        // 目标方法没有返回值，则不需要缓存结果
        if (Objects.isNull(proceed)){
            return null;
        }
        Result<Object> objectResult = new Result<>();
        objectResult.setResult(proceed);
        objectResult.setArgs(point.getArgs());
        objectResult.setName(signature.getMethod().getName());
        objectResult.setRunDuration(System.currentTimeMillis()-start);
        objectResult.setTime(LocalDateTime.now().toString());

        if (!prefix.equals("") || !key.equals( "")){
            prefix = prefix.equals("")? prefix: prefix+"_";
            cacheManage.setValue(prefix+key,objectResult);
        }else{
            cacheManage.setValue(signature.getMethod().getName(), objectResult);
        }
        return proceed;
    }
}
