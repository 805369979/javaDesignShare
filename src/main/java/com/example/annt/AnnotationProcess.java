package com.example.annt;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * 洁祎
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface AnnotationProcess {
    String value();
}