package com.example.chain_adapter_strategy;

import com.example.chain_adapter_strategy.charingStrategy.IVoltageAbs;
import com.example.dp.adapter.Voltage220V;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public abstract class AbsAdapter extends Voltage220V implements IVoltageInterface{
    @Autowired
    protected List<IVoltageAbs> iVoltageAbs;
    // 下一个
    protected AbsAdapter nextAdapter;

    public AbsAdapter() {
    }
}
