package com.example.SingleDog.chain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
  *  分手
 */
@Data
@AllArgsConstructor
public class SingleDogContext {
    // 是否最终改变
    String type;
    // 意难平策略
    private List<String> strategy;
    // 领悟到的精髓
    private List<String> trait;

}
