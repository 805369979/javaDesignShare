package com.example.dp.chain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
  *  请假条
 */
@Data
@AllArgsConstructor
public class LeaveRequest {
    private String name;
    private Integer days;
}
