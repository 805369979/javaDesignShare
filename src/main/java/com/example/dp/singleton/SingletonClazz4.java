package com.example.dp.singleton;

/**
 * 单例模式   懒汉式  必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 */
public class SingletonClazz4 {
    private static SingletonClazz4 instance;

    private SingletonClazz4() {
    }

    public static synchronized SingletonClazz4 getInstance() {
        if (instance == null) {
            instance = new SingletonClazz4();
        }
        return instance;
    }
}
