package com.example.SingleDog.adapter;

import org.springframework.stereotype.Component;

/**
 * 秦同学
 */
@Component
public class HumanAdapter extends OldYour implements NewYou {

    @Override
    public void newYour(String type) {
        if ("normal".equalsIgnoreCase(type)) {
            System.out.println(badHourivor()+"已经不存在");;
            System.out.println("您已经重生");
        } else if ("bad".equalsIgnoreCase(type)) {
            System.out.println(badHourivor());
            System.out.println("您需要继续努力呀");
        }
    }
}
