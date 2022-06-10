package com.example.FilterChain;

import lombok.Data;
import java.util.*;

/**
 * 过滤链
 * @param <T>
 */
@Data
public class DefaultFilterChain<T> implements FilterChain<T> {

    private final List<Filter<T>>       filters;
    // 记录过滤器的位置，当前执行到哪一个过滤器啦
    private final int                   index;
    private final Map<String, Object>   context;

    /**
     * 执行过滤操作
     */
    public Collection<T> handle(Collection<T> elements) {
        return new DefaultFilterChain<>(filters).filter(elements);
    }

    /**
     * 执行过滤操作
     */
    public Collection<T> handle(Collection<T> elements, Map<String, Object> context) {
        return new DefaultFilterChain<>(filters, context).filter(elements);
    }

    public DefaultFilterChain(List<Filter<T>> filters) {
        this.filters = filters;
        this.index = 0;
        this.context = new HashMap<>();
    }

    public DefaultFilterChain(List<Filter<T>> filters, Map<String, Object> context) {
        this.filters = filters;
        this.index = 0;
        this.context = Optional.ofNullable(context).orElseGet(HashMap::new);
    }

    public DefaultFilterChain(DefaultFilterChain<T> parent, int index) {
        this.filters = parent.getFilters();
        this.index = index;
        this.context = parent.getContext();
    }


    /**
     * 编排好过滤器的执行顺序
     * @param elements 元素集
     * @return
     */
    @Override
    public Collection<T> filter(Collection<T> elements) {
        if (this.index < filters.size()) {
            Filter<T> filter = filters.get(this.index);
            DefaultFilterChain<T> chain = new DefaultFilterChain<>(this, this.index + 1);
            return filter.filter(elements, chain);
        }
        else {
            return elements;
        }
    }

}
