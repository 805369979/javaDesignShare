package com.example.annt;

/**
 * 洁祎
 */

@AnnotationProcess(value = "test1")
public class TaskProcessor1 implements AnnotationService<AnnotationParam> {
    @Override
    public void process(AnnotationParam param) {
        System.out.println("处理业务2");
    }
}

