package com.lee.learn.dp.structualpattern.bridge.wrench;

import com.lee.learn.dp.structualpattern.bridge.Worker;

public class PrimaryWorker extends Worker {
    public PrimaryWorker(Wrench wrench) {
        super(wrench);
    }

    @Override
    public void repairCar() {
        System.out.println("Primary Worker repair car");
        getWrench().twist();
        System.out.println("Primary Worker repair car finished");
    }
}
