package com.example.dp.singleton;

/**
 * 单例模式   饿汉式  类加载时就初始化，浪费内存。
 */
public class SingletonClazz2 {
    private static SingletonClazz2 instance = new SingletonClazz2();

    private SingletonClazz2() {
    }

    public static SingletonClazz2 getInstance() {
        return instance;
    }
}
