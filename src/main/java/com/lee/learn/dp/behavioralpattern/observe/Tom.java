package com.lee.learn.dp.behavioralpattern.observe;

public class Tom implements Observer {
    @Override
    public void update() {
        System.out.println("Tom is updated");
    }
}
