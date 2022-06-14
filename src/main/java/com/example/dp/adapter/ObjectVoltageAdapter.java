package com.example.dp.adapter;


public class ObjectVoltageAdapter  implements IVoltage5V {
    private Voltage220V voltage220V;
    //构造器
    public ObjectVoltageAdapter(Voltage220V voltage220v) {
        this.voltage220V = voltage220v;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if(null != voltage220V) {
            int src = voltage220V.output220V();//获取220v电压
            dst = src / 44;
        }
        return dst;
    }
}
