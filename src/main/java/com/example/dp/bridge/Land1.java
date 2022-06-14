package com.example.dp.bridge;

/**
 * 秦同学
 */
public class Land1 extends Cross {

    public Land1(BridgeStandard standard) {
        super(standard);
    }

    @Override
    public void arriveLand() {
        this.getStandard().bridge();
        System.out.println("到达岸边1");
    }
}
