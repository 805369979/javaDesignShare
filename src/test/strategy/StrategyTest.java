//package com.example.studycode.strategy;
//
//import com.example.StudyCodeApplication;
//import com.example.strategySelect.strategyTask.AbstractQuery;
//import com.example.strategySelect.strategyTask.GoodDataQuery;
//import com.example.strategySelect.strategyTask.QueryStrategyCenter;
//import com.example.strategySelect.strategyTask.StrategySelectEnum;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = StudyCodeApplication.class)
//public class StrategyTest {
//
//    @Autowired
//    QueryStrategyCenter center;
//
//    @Test
//    void testStrategy() {
//
//        Map<StrategySelectEnum, String> selectCondition = new HashMap<>();
//        selectCondition.put(StrategySelectEnum.GOOD_QUERY, "good");
//        selectCondition.put(StrategySelectEnum.ITEM_QUERY, "item");
//
//        Map<String,AbstractQuery> abstractQueryStringMap = center.selectAbstractQuery(selectCondition);
//        for (String query:abstractQueryStringMap.keySet()) {
//            AbstractQuery abstractQuery = abstractQueryStringMap.get(query);
//
//        }
//    }
//}
