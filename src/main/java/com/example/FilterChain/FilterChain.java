package com.example.FilterChain;

import java.util.Collection;
import java.util.Map;

/**
 * 过滤链
 */
public interface FilterChain<T> {

    /**
     * 过滤集合中的元素
     *
     * @param elements 元素集
     */
    Collection<T> filter(Collection<T> elements);

    /**
     * 获取上下文
     * @return 上下文
     */
    Map<String, Object> getContext();
}

