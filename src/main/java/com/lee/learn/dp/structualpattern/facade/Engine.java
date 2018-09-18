package com.lee.learn.dp.structualpattern.facade;

public class Engine {
    private boolean runState = false;

    public void start() {
        System.out.println("Engine.start");
        runState = true;
        System.out.println("Engine.start.over");
    }

    public void stop() {
        System.out.println("Engine.stop");
        runState = false;
        System.out.println("Engine.stop.over");
    }
}
