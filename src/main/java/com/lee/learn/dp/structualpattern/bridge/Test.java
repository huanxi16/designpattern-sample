package com.lee.learn.dp.structualpattern.bridge;

import com.lee.learn.dp.structualpattern.bridge.wrench.MediumWrench;
import com.lee.learn.dp.structualpattern.bridge.wrench.PrimaryWorker;
import com.lee.learn.dp.structualpattern.bridge.wrench.Wrench;

public class Test {
    public static void main(String[] args) {
        Wrench wrench = new MediumWrench();
        Worker worker = new PrimaryWorker(wrench);
        worker.repairCar();
    }
}
