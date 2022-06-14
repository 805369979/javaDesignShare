package com.example.dp.adapter;

public class Client {

    public static void main(String[] args) {

        System.out.println(" === 类适配器模式 ====");
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        Phone phone = new Phone();
        //充电
        phone.charging(voltageAdapter);

        System.out.println("===对象适配器===");
        Phone phone1 = new Phone();
        Voltage220V voltage220V = new Voltage220V();
        ObjectVoltageAdapter VoltageAdapter = new ObjectVoltageAdapter(voltage220V);
        phone1.charging(VoltageAdapter);
    }
}