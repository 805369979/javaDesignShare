package com.example.studycode;

import com.example.StudyCodeApplication;
import com.example.cache.CacheManage;
import com.example.cache.EnhanceCache;
import com.example.cache.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 秦同学
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudyCodeApplication.class)
public class DTest {

    @Autowired
    EnhanceCache enhanceCache;

    @Autowired
    CacheManage cacheManage;

    @Test
    public void testStrategy() throws InterruptedException {

        enhanceCache.getCode();
        enhanceCache.getNames();
        enhanceCache.getNameWithArgs("test");

        cacheManage.foreach();

        Result<Object> getNames1 = cacheManage.getValue("Pre_getCode");
        System.out.println("======================");

        Object sdvs = cacheManage.delete("Pre_getCode");
        System.out.println(sdvs);

    }

}
