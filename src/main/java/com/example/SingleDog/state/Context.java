package com.example.SingleDog.state;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 秦同学
 */
@Component
@Data
public class Context {
    private State state;
}
