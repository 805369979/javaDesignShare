package com.example.FilterChain;
import java.util.Collection;

/**
 * 过滤器标准
 * @param <T>
 */
public interface Filter<T> {

    /**
     * 过滤器标准定义
     */
    Collection<T> filter(Collection<T> elements, FilterChain<T> chain);
}

