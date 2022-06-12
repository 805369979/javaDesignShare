package com.example.dp.singleton;

/**
 * 单例模式   懒汉式，线程不安全
 */
public class SingletonClazz1 {
    private static SingletonClazz1 instance;

    private SingletonClazz1() {
    }

    public static SingletonClazz1 getInstance() {
        if (instance == null) {
            instance = new SingletonClazz1();
        }
        return instance;
    }
}
