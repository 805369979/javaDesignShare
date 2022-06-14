package com.example.dp.adapter.interfaceAdpat;

public class Phone {
    public void charging(IVoltage5VAbs iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压是5v，可以充电");
        } else if (iVoltage5V.output10V() == 10) {
            System.out.println("电压等于10v，不可充电");
        } else if (iVoltage5V.output20V() == 20) {
            System.out.println("电压等于20v，不可充电");
        }
    }
}
