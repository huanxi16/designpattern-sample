package com.lee.learn.dp.behavioralpattern.strategy;

public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("Knife thrust");
    }
}
