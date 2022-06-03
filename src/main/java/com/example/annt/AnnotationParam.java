package com.example.annt;

import lombok.Data;

import java.io.Serializable;

/**
 * 洁祎
 */
@Data
public class AnnotationParam implements Serializable {
    private static final long serialVersionUID = -5839342956424009429L;
    /**
     * 业务类型
     */
    private String bizType;
}
