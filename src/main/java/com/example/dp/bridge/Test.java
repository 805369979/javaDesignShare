package com.example.dp.bridge;

public class Test {
    public static void main(String[] args) {
        Land1 land1 = new Land1(new Bridge1());
        land1.arriveLand();

        Land1 land3 = new Land1(new Bridge2());
        land3.arriveLand();

        Land2 land2 = new Land2(new Bridge2());
        land2.arriveLand();
    }
}
