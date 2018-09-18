package com.lee.learn.dp.structualpattern.bridge.wrench;

public class LargeWrench implements Wrench {
    @Override
    public void twist() {
        System.out.println("LargeWrench.twist");
    }
}
