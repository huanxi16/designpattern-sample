package com.lee.learn.dp.behavioralpattern.strategy;

public class Client {
    public static void main(String[] args) {
        Weapon weapon = new Cannon();
        weapon.attack();
    }
}
