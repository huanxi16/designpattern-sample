package com.lee.learn.dp.structualpattern.bridge.wrench;

public class SmallWrench implements Wrench {
    @Override
    public void twist() {
        System.out.println("SmallWrench.twist");
    }
}
