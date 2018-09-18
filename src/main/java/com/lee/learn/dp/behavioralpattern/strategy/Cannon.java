package com.lee.learn.dp.behavioralpattern.strategy;

public class Cannon implements Weapon {
    @Override
    public void attack() {
        System.out.println("Cannon bomb");
    }
}
