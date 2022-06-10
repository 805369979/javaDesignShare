package com.example.annotationUse;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 秦同学
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassMenthodAuthLog {
    // 打印的信息
    String logInfo();
    // 执行方法的权限
    String auth();
}
