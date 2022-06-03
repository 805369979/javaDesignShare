package com.example.retry;

import java.util.Optional;
import java.util.Random;

public class test{

    public static void main(String[] args) {

        Optional<Boolean> result = RetryUtils.<Boolean>fromTask(() -> {
                    return task();})
                .retryTimes(3)
                .retryTimesLong(500L)
                .getResult();

        Optional<Boolean> result1 = RetryUtils.<Boolean>fromTask(() -> {
                    return task();})
                .retryTimes(3)
                .retryTimesLong(500L)
                .getResult();

    }
    public static Boolean task(){
        System.out.println("测试");
        return Boolean.TRUE;
    }

}
