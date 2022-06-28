package com.example.SingleDog.builder;

public abstract class Builder {
    //创建领悟到的思想吧
    protected Trait trait = new Trait();
    public abstract void buildBraked(String trait);
    //返回
    public Trait getResult() {
        return trait;
    }
}
