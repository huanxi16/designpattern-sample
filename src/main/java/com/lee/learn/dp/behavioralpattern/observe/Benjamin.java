package com.lee.learn.dp.behavioralpattern.observe;

public class Benjamin implements Observer {
    @Override
    public void update() {
        System.out.println("Benjamin is updated.");
    }
}
