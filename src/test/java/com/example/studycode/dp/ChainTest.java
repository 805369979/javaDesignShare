package com.example.studycode.dp;

import com.example.dp.chain.*;
import org.junit.Test;

/**
 * 秦同学
 */
public class ChainTest {

    @Test
    public void process() {
        AbstractHandler directorHandler = new DirectorHandler("p7");
        AbstractHandler managerHandler = new Manager("p8");
        AbstractHandler topManagerHandler = new TopManager("p9");

        directorHandler.setNextHandler(managerHandler);
        managerHandler.setNextHandler(topManagerHandler);

        directorHandler.process(new LeaveRequest("斌斌", 7));
    }
}