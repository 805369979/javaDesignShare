package com.example.dp.adapter.interfaceAdpat;


public class Client {
    public static void main(String[] args) {
        System.out.println("===接口适配器===");
        AbsAdapter absAdapter = new AbsAdapter() { //匿名内部类的形式
//            @Override //按需要重写接口方法
//            public int output5V() {
//                System.out.println("使用了output5V的方法");
//                // 可以对默认的适配结果修改
//                int res = super.output5V();
//                int srcV = output220V();
//                int dstV = srcV / 44 ; //转成5v
//                return dstV;
////                return 0;
//            }
            @Override //按需要重写接口方法
            public int output10V() {
                System.out.println("使用了output10V的方法");
                // 可以对默认的适配结果修改
                int res = super.output5V();

                int srcV = output220V();
                int dstV = srcV / 44 ; //转成10v
                return dstV;
            }
        };
        Phone phone = new Phone();
        phone.charging(absAdapter);
    }
}