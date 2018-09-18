package com.lee.learn.dp.behavioralpattern.state.statemachine;

public class SoldOutState implements State {

    private Machine machine;

    public SoldOutState(Machine machine) {
        this.machine = machine;
    }

    public void insertCoin() {
        System.out.println("toy has been sold out...");
        throw new RuntimeException();
    }

    public void returnCoin() {
        System.out.println("toy has been sold out...");
        throw new RuntimeException();
    }

    public void turnCrank() {
        System.out.println("toy has been sold out...");
        throw new RuntimeException();
    }

    public void reset() {
        System.out.println("toy has been sold out...");
        throw new RuntimeException();
    }
}
