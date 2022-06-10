package com.example.FilterChain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Filter<String> stringFilter = (e,chain)->{
            List<String> collect = e.stream().filter((data) -> {return data.endsWith("n");}).collect(Collectors.toList());
            return chain.filter(collect);
        };

        Filter<String> stringFilter1 = (e,chain)->{
            List<String> collect = e.stream().filter((data) -> {return data.startsWith("q");}).collect(Collectors.toList());
            return chain.filter(collect);
        };

        Filter<String> stringFilter2 = (e,chain)->{
            List<String> collect = e.stream().filter((data) -> {return data.startsWith("x");}).collect(Collectors.toList());
            return chain.filter(collect);
        };
        OrderedFilter<String> stringOrderedFilter = new OrderedFilter<>(stringFilter2, 1);

        ArrayList<String> objects = new ArrayList<>();
        objects.add("qinbinbin");
        objects.add("n");
        objects.add("qin");
        objects.add("bin");

        Collection<String> handle =
                FilteringHandler.<String>createHandler(stringFilter, stringFilter1,stringOrderedFilter).handle(objects);
        System.out.println(handle);
    }
}
