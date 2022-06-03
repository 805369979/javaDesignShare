package com.example.studycode.nodes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Objects;

/**
 * @author jieyi,demin
 */
@Component
public abstract class StrategyTemplate<P,R> {

    /**
     *路由定义
     */
    interface StrategyMap<P,R>{
        StrategyHandler<P,R> get(P param);
    }

    private StrategyMap<P, R> strategyMapper;
    /**
     * 类初始化时注册分发策略
     */
    @PostConstruct
    public void abstractInit() {
        strategyMapper = registerStrategyMapper();
        Objects.requireNonNull(strategyMapper, "strategyMapper cannot be null");
    }
    /**
     * 分发逻辑
     */
    protected abstract StrategyMap<P, R> registerStrategyMapper();

    @Setter
    @Getter
    private StrategyHandler<P, R> defaultStrategyHandler = StrategyHandler.DEFAULT;

    /**
     * 执行策略，框架会自动根据策略分发至下游的 Handler 进行处理
     ** @return 下游执行者给出的返回值
     */
    public R applyStrategy(P param) {
        final StrategyHandler<P, R> strategyHandler = strategyMapper.get(param);
        if (strategyHandler != null) {
            return strategyHandler.apply(param);
        }
        return defaultStrategyHandler.apply(param);
    }
}
