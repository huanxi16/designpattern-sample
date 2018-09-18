package com.lee.learn.dp.behavioralpattern.observe;

public interface Subject {

    void registerObserver(Observer observer);

    void unRegisterObserver(Observer observer);

    void notifyObservers();

    void changed();
}
