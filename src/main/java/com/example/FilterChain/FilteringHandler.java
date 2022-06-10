package com.example.FilterChain;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.core.Ordered;

/**
 * 过滤链执行器
 */
public class FilteringHandler<T> {

    private final List<Filter<T>> filters;

    public FilteringHandler(List<Filter<T>> filters) {
        this.filters = this.loadFilters(filters);
    }

    private List<Filter<T>> loadFilters(List<Filter<T>> filters) {
        return Stream.iterate(0, i -> i + 1)
            .limit(filters.size())
            .map(index -> {
                Filter<T> filter = filters.get(index);
                if (filter instanceof Ordered) {
                    int order = ((Ordered) filter).getOrder();
                    return new OrderedFilter<>(filter, order);
                }
                else {
                    return new OrderedFilter<>(filter, index);
                }
            })
            .sorted(Comparator.comparingInt(OrderedFilter::getOrder))
            .collect(Collectors.toList());
    }

    // 过滤链路执行入口
    @SafeVarargs
    public static <T> FilteringHandler<T> createHandler(Filter<T>... filters) {
        return new FilteringHandler<>(Arrays.asList(filters));
    }

    // 执行过滤操作
    public Collection<T> handle(Collection<T> elements) {
        return new DefaultFilterChain<>(filters).filter(elements);
    }

    // 执行过滤操作
    public Collection<T> handle(Collection<T> elements, Map<String, Object> context) {
        return new DefaultFilterChain<>(filters, context).filter(elements);
    }

}

