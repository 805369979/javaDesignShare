package com.example.TaskNoticeStr.Factory;

import com.example.TaskNoticeStr.Observer;
import com.example.TaskNoticeStr.entity.Condition;
import com.example.TaskNoticeStr.entity.Notice;
import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * 秦同学
 **/
@Data
public class ComponentFactory {
    private static Map<String, com.example.TaskNoticeStr.Observer> observers = new HashMap<>();

    public static void addObserver(String key, com.example.TaskNoticeStr.Observer observer){
        observers.put( key ,observer);
    }
    public static void removeObserver(String key){
        observers.remove(key);
    }

    //通知
    public static void notifyAllObservers(Notice notice, Condition condition) {
        // 没有过滤则直接全部通知
        if (condition == null || CollectionUtils.isEmpty(condition.getNeedNotice())) {
            observers.forEach((key,value) -> value.doEvent(notice));
            return;
        }

        List<String> needNotice = condition.getNeedNotice();
        for (String need : needNotice ){
            Observer observer = observers.get(need);
            if (Objects.isNull(observer)){
                continue;
            }
            observer.doEvent(notice);
        }
    }
}