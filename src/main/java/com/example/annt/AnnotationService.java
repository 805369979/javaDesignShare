package com.example.annt;


/**
 * 洁祎
 */
public interface AnnotationService<P> {
    /**
     * 不同服务的处理方法
     */
    void process(P param);
}