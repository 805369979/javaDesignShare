package com.example.SingleDog.decorator;

/**
 * 秦同学
 */
public abstract class HumanDecorator implements Human {
    protected final Human decoratedHuman;

    public HumanDecorator(Human human) {
        decoratedHuman = human;
    }

    @Override
    public String getYourself() {
        return decoratedHuman.getYourself();
    }
}
