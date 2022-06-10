package com.example.FilterChain;

import java.util.Collection;

import lombok.Getter;
import org.springframework.core.Ordered;

/**
 * 有序过滤器
 */
@Getter
public class OrderedFilter<T> implements Filter<T>, Ordered {

    private final Filter<T>     delegate;
    private final int           order;

    public OrderedFilter(Filter<T> delegate, int order) {
        this.delegate = delegate;
        this.order = order;
    }


    @Override
    public Collection<T> filter(Collection<T> elements, FilterChain<T> chain) {
        return this.delegate.filter(elements, chain);
    }
}

