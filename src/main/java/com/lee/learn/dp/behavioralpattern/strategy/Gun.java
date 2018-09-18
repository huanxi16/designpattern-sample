package com.lee.learn.dp.behavioralpattern.strategy;

public class Gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("Gun shoot");
    }
}
