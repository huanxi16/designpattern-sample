package com.lee.learn.dp.structualpattern.bridge.wrench;

public class MediumWrench implements Wrench {
    @Override
    public void twist() {
        System.out.println("MediumWrench.twist");
    }
}
