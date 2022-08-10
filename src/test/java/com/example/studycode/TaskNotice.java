package com.example.studycode;

import com.example.StudyCodeApplication;
import com.example.TaskNoticeStr.Component1Enum;
import com.example.TaskNoticeStr.entity.Condition;
import com.example.TaskNoticeStr.entity.Notice;
import com.example.TaskNoticeStr.Factory.ComponentFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudyCodeApplication.class)
public class TaskNotice {

    @Test
    public void test() {
        Notice notice = new Notice();
        Condition condition = new Condition();
        condition.setNeedNotice(Arrays.asList(Component1Enum.ObserverClean1.getCode()));
        // 工厂统一调度通知
        ComponentFactory.notifyAllObservers(notice,condition);
    }
}
