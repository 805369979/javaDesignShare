package com.example.studycode.annotationUserTest;

import com.example.StudyCodeApplication;
import com.example.annotationUse.ServiceTask;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jieyi
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudyCodeApplication.class)
class AnnotionUseTest {

    @Autowired
    ServiceTask annotionTask;
    @Test
    void contextLoads() {
        Object test = annotionTask.getData("test");
        System.out.println(test);
    }
}
