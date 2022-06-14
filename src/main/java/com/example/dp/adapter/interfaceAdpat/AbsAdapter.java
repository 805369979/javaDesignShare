package com.example.dp.adapter.interfaceAdpat;

import com.example.dp.adapter.Voltage220V;


public abstract class AbsAdapter extends Voltage220V implements IVoltage5VAbs {

    @Override //以空方法实现接口所有方法
    public int output5V() {
        return 0;
    }
    @Override
    public int output10V() {
        return 0;
    }
    @Override
    public int output20V() {
        return 0;
    }
}
