package com.example.studycode.nodes;

/**
 * @author jieyi,demin
 */
public interface StrategyHandler<P,R> {
    StrategyHandler DEFAULT = t -> null;
    R apply(P condition);
}
