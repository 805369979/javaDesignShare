package com.example.dp.singleton;

/**
 * 单例模式 双检锁/双重校验锁   这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 */
public class SingletonClazz {
    private static volatile SingletonClazz instance;

    private SingletonClazz() {
    }

    public static SingletonClazz getInstance() {
        if (instance == null) {
            synchronized (SingletonClazz.class) {
                if (instance == null) {
                    instance = new SingletonClazz();
                }
            }
        }
        return instance;
    }
}
