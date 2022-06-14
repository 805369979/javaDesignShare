package com.example.dp.template;

/**
 * 秦同学
 */
public class TemplateImpl extends AbstractTemplate {

    @Override
    protected void handler() {
        System.out.println("正在处理中");
    }

    public static void main(String[] args) {
        AbstractTemplate template = new TemplateImpl();
        template.templateMethod();
    }
}
