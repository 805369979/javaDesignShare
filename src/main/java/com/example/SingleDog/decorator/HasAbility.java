package com.example.SingleDog.decorator;

/**
 * 秦同学
 */
public class HasAbility extends HumanDecorator {
    public HasAbility(Human human) {
        super(human);
    }

    @Override
    public String getYourself() {
        return super.getYourself()+"能力更强";
    }
}

