package com.lee.learn.dp.structualpattern.proxy;

public class Service implements Targetable {
    @Override
    public String run() {
        System.out.println("Service.run()");
        return "service";
    }
}
