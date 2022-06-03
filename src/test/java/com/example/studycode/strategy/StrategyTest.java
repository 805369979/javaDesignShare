package com.example.studycode.strategy;

import com.example.StudyCodeApplication;
import com.example.strategySelect.strategyTask.QueryStrategyCenter;
import com.example.strategySelect.strategyTask.StrategySelectEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudyCodeApplication.class)
public class StrategyTest {

    @Test
    public void testStrategy() {
        // 实例化策略调度中心
        QueryStrategyCenter queryStrategyCenter = new QueryStrategyCenter();

        // 定义用户指定的策略
        Map<StrategySelectEnum, String> selectCondition = new HashMap<>();
        selectCondition.put(StrategySelectEnum.GOOD_QUERY, "good");
        selectCondition.put(StrategySelectEnum.ITEM_QUERY, "item");

        Boolean template = queryStrategyCenter.template(selectCondition);
        System.out.println("是否执行成功"+template);
        System.out.println("====================================");

        Map<StrategySelectEnum, String> one = new HashMap<>();
        one.put(StrategySelectEnum.GOOD_QUERY, "good");
        Boolean template1 = queryStrategyCenter.template(one);
        System.out.println("是否执行成功"+template1);
        System.out.println("====================================");


        Map<StrategySelectEnum, String> noParam = new HashMap<>();
        Boolean schedule1 = queryStrategyCenter.template(noParam);
        System.out.println("是否执行成功"+schedule1);
    }
}
