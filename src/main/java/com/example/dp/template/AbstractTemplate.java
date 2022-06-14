package com.example.dp.template;

/**
 * 秦同学
 */
public abstract class AbstractTemplate {
    public void templateMethod() {
        preHandler();
        handler();
        postHandler();
    }

    protected abstract void handler();

    protected void preHandler() {
        System.out.println("模板的前置处理");
    }

    private void postHandler() {
        System.out.println("模板的前置处理");
    }
}
