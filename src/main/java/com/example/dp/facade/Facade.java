package com.example.dp.facade;

/**
 * 秦同学
 */
public class Facade {
    private ServiceA serviceA;
    private ServiceB serviceB;
    private ServiceC serviceC;

    public Facade() {
        this.serviceA = new ServiceAImpl();
        this.serviceB = new ServiceBImpl();
        this.serviceC = new ServiceCImpl();
    }

    public void methodA() {
        serviceA.methodA();
    }

    public void methodB() {
        serviceB.methodB();
    }

    public void methodC() {
        serviceC.methodC();
    }
}
