package com.example.TaskNoticeStr;

import com.example.TaskNoticeStr.entity.Notice;
import org.springframework.stereotype.Component;

/**
 * 秦同学
 **/
@Component
public class Component3 extends AbstractComponent<Notice> {

    @Override
    public String getName() {
        return Component1Enum.ObserverClean3.getCode();
    }

    @Override
    public void doEvent(Notice notice) {
        System.out.println("接受者3");
    }
}
