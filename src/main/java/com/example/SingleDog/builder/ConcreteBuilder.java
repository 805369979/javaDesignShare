package com.example.SingleDog.builder;

import org.springframework.stereotype.Component;

@Component
public class ConcreteBuilder extends Builder {

    @Override
    public void buildBraked(String trait) {
        this.trait.setTrait(trait);
    }
}
