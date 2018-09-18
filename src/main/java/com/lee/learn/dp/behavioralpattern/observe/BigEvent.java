package com.lee.learn.dp.behavioralpattern.observe;

public class BigEvent extends AbstractSubject {

    @Override
    public void changed() {
        System.out.println("Changed");
        notifyObservers();
        System.out.println("Notified");
    }
}
