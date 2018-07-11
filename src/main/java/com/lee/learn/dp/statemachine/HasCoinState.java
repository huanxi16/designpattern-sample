package com.lee.learn.dp.statemachine;

public class HasCoinState implements State {

    private Machine machine;

    public HasCoinState(Machine machine) {
        this.machine = machine;
    }

    public void insertCoin() {
        System.out.println("you have inserted one coin...");
        throw new RuntimeException();
    }

    public void returnCoin() {
        System.out.println("you want to return your coin...");
        machine.setCurrentState(machine.getNoCoinState());
    }

    public void turnCrank() {
        System.out.println("waiting to toy out...");
        machine.setCurrentState(machine.getSoldState());
    }

    public void reset() {
        System.out.println("no available operation...");
        throw new RuntimeException();
    }
}
