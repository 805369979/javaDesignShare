package com.example.palace;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
  *  申请建造皇宫请求
 */
@Data
@AllArgsConstructor
public class BuildPandasRequest {
    private List<PandasHouse> house;

    @Data
    public static class PandasHouse{
        public String houseName;
        public String houseShape;
    }
}
