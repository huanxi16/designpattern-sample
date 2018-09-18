package com.lee.learn.dp.structualpattern.bridge;

import com.lee.learn.dp.structualpattern.bridge.wrench.Wrench;

/**
 * 桥接模式: 将抽象化与实现化解耦，使得二者可以独立变化
 */
public abstract class Worker {
    private Wrench wrench;

    public Worker(Wrench wrench) {
        this.wrench = wrench;
    }

    public abstract void repairCar();

    public Wrench getWrench() {
        return wrench;
    }

    public void setWrench(Wrench wrench) {
        this.wrench = wrench;
    }
}
