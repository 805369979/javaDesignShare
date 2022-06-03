package com.example.studycode;

import com.example.StudyCodeApplication;
import com.example.annt.AnnotationParam;
import com.example.annt.TestTask;
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
class StudyCodeApplicationTests {

    @Autowired
    Node node;
    @Autowired
    TestTask testTask;
    @Test
    void testAnno(){
        // 模拟客户端调用

        AnnotationParam annotationParam = new AnnotationParam();
        annotationParam.setBizType("test");
        testTask.receiver(annotationParam);

        AnnotationParam annotationParam1 = new AnnotationParam();
        annotationParam1.setBizType("test1");
        testTask.receiver(annotationParam1);

        testTask.receiver(new AnnotationParam());
    }

    @Test
    void contextLoads() {
//        Node test = new Node();
        Param2 param2 = new Param2();
        param2.setCondition1(100);
        param2.setCondition2(200);
        Param1 apply2 = node.apply(param2);
//        System.out.println(apply2);
        System.out.println("==================================");
        Param2 param = new Param2();
        param.setCondition1(200);
        param.setCondition2(100);
        Param1 apply = node.apply(param);
        System.out.println(apply);
        System.out.println("==================================");
        Param2 param3 = new Param2();
        param3.setCondition1(200);
        param3.setCondition2(300);
        Param1 apply3 = node.apply(param3);
        System.out.println(apply3);
    }


}
