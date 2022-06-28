package com.example.SingleDog.decorator;

/**
 * 秦同学
 */
public class HasMoney extends HumanDecorator {
    public HasMoney(Human human) {
        super(human);
    }

    @Override
    public String getYourself() {
        return super.getYourself()+"有钱了";
    }
}

