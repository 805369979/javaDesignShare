package com.example.TaskNoticeStr;

import java.util.ArrayList;
import java.util.List;
/**
 * 秦同学
 **/
public enum Component1Enum {
    ObserverClean1("ObserverClean1"),ObserverClean2("ObserverClean2"), ObserverClean3("ObserverClean3");

    String code;

    Component1Enum(String code) {
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
        for (Component1Enum enumValue : Component1Enum.values()) {
            MAP_CODE_2_ENUM.add(enumValue.getCode());
        }
    }
}
