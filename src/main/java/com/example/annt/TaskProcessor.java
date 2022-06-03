package com.example.annt;

/**
 * 洁祎
 */

@AnnotationProcess(value = "test")
public class TaskProcessor implements AnnotationService<AnnotationParam> {
    @Override
    public void process(AnnotationParam param) {
        System.out.println("处理业务1");
    }
}

