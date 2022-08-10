package com.example.TaskNoticeStr;

import com.example.TaskNoticeStr.Factory.ComponentFactory;
import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

@Data
public abstract class AbstractComponent<T> implements InitializingBean, Observer<T> {

    @Override
    public void afterPropertiesSet() {
        ComponentFactory.addObserver(getName(), this);
    }

    public abstract String getName();
}
