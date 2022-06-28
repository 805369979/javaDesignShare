package com.example.cache;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 秦同学
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface OrderTask {
    /**
     * key
     */
    String key() default "";
    /**
     * 前缀
     */
    String prefix() default "";

}
