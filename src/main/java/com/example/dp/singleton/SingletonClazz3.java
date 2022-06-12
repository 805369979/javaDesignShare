package com.example.dp.singleton;

/**
 * 单例模式  登记式/静态内部类  这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，
 */
public class SingletonClazz3 {

    private static class SingletonHolder {
        private static final SingletonClazz3 INSTANCE = new SingletonClazz3();
    }

    private SingletonClazz3() {
    }

    public static final SingletonClazz3 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
