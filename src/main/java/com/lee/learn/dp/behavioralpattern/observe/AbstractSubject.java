package com.lee.learn.dp.behavioralpattern.observe;

import java.util.*;

public abstract class AbstractSubject implements Subject {

    private Set<Observer> observers = new HashSet<>();

    @Override
    public void registerObserver(Observer observer) {
        Objects.requireNonNull(observer);
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
