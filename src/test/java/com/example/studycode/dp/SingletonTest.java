package com.example.studycode.dp;

import com.example.dp.singleton.SingletonClazz;
import com.example.dp.singleton.SingletonClazz5;


public class SingletonTest {

    public static void main(String[] args) {
        SingletonClazz instance = SingletonClazz.getInstance();
        SingletonClazz instance1 = SingletonClazz.getInstance();
        System.out.println(instance == instance1);

        SingletonClazz5 instance2 = SingletonClazz5.INSTANCE;
        SingletonClazz5 instance3 = SingletonClazz5.INSTANCE;
        System.out.println(instance2 == instance3);

    }
}
