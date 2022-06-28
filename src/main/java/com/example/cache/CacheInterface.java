package com.example.cache;

/**
 * 秦同学
 */
public interface CacheInterface<T,R> {
    R getValue(T key);
    void setValue(T key1,R value);
    boolean update(T key1,R value);
    boolean delete(T key);
    void deleteAll();
    void foreach();
}
