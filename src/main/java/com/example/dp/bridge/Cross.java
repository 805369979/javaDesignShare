package com.example.dp.bridge;

import lombok.Data;

/**
 * 秦同学
 */
@Data
public abstract class Cross {

    private BridgeStandard standard;

    public Cross(BridgeStandard standard) {
        this.standard = standard;
    }

    public abstract void arriveLand();
}
