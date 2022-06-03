package com.example.studycode.dynamicscheduling;

import com.example.StudyCodeApplication;
import com.example.annt.AnnotationParam;
import com.example.annt.TestTask;
import com.example.dynamicScheduling.DispatchFunctionImp;
import com.example.dynamicScheduling.Param;
import com.example.studycode.nodes.Node;
import com.example.studycode.nodes.Param1;
import com.example.studycode.nodes.Param2;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 洁祎
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudyCodeApplication.class)
class dynamicSchedulingTests {

    @Autowired
    DispatchFunctionImp dispatchFunctionImp;
    @Test
    void testAnno(){
        Param param = new Param();
        param.setBizType("test");
        Boolean run = dispatchFunctionImp.run(param);
        System.out.println(run);
        System.out.println("============================");

        Param param1 = new Param();
        param1.setBizType("test1");
        Boolean run1 = dispatchFunctionImp.run(param1);
        System.out.println(run1);

        Param param2 = new Param();
        Boolean run2 = dispatchFunctionImp.run(param2);
        System.out.println(run2);
    }

}
