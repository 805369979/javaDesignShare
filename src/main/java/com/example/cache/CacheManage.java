package com.example.cache;

import org.apache.commons.collections4.map.MultiKeyMap;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 秦同学
 */
@Component
public class CacheManage implements CacheInterface<String,Result>{

    // 本地缓存
    public static Map<String,Result<Object>> cache = new ConcurrentHashMap<>();
    @Override
    public Result<Object> getValue(String key) {
        if (Objects.nonNull(key)){
            return cache.get(key);
        }
        return null;
    }

    @Override
    public void setValue(String key, Result value) {
        if (Objects.nonNull(key) && cache.get(key) != null) {
            return;
        }
        cache.put(key,value);
    }

    @Override
    public boolean update(String key1, Result value) {
        if (Objects.nonNull(key1)){
            cache.put(key1,value);
            return true;
        }
        throw new RuntimeException("缓存的key需要指定");
    }

    @Override
    public boolean delete(String key) {
        Object remove = cache.remove(key);
        return remove != null;
    }

    @Override
    public void deleteAll() {
        cache.clear();
    }

    @Override
    public void foreach() {
        cache.entrySet().forEach(System.out::println);
    }
}
