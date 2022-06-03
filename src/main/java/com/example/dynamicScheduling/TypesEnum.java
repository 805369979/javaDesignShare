package com.example.dynamicScheduling;

import java.util.ArrayList;
import java.util.List;

/**
 * 秦同学
 */
public enum TypesEnum {
    test("test"),test1("test1");

    String code;

    TypesEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    /**
     * 映射文件类型到枚举值
     */
    final static List<String> MAP_CODE_2_ENUM = new ArrayList<>();

    static {
        // 初始化映射文件类型到枚举值
        for (TypesEnum enumValue : TypesEnum.values()) {
            MAP_CODE_2_ENUM.add(enumValue.getCode());
        }
    }
}
