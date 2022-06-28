package com.example.SingleDog.builder;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Direct {
    private Builder builder;
    //产品构建与组装方法
    public Trait construct(String trait) {
        builder.buildBraked(trait);
        return builder.getResult();
    }

}
