package com.example.studycode.dp;

import com.example.StudyCodeApplication;
import com.example.palace.BuildPandasRequest;
import com.example.palace.Template;
import com.example.palace.outline.Facade;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * TODO:doc
 *
 * @author jieyi
 * @version : Pandas.java, v 0.1 2022年06月15日 7:50 下午 jieyi Exp $
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudyCodeApplication.class)
public class Pandas {

    @Autowired
    Template template;

    @Test
    public void contextLoads() {
        template.build();
    }
}
