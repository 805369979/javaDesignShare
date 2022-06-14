package com.example.dp.bridge;

/**
 * 秦同学
 */
public class Land2 extends Cross {

    public Land2(BridgeStandard standard) {
        super(standard);
    }

    @Override
    public void arriveLand() {
        this.getStandard().bridge();
        System.out.println("到达岸边2");
    }
}
