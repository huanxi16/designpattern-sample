package com.lee.learn.dp.statemachine;

public class NoCoinState implements State {

    private Machine machine;

    public NoCoinState(Machine machine) {
        this.machine = machine;
    }

    public void insertCoin() {
        System.out.println("user inserts into one coin...");
        machine.setCurrentState(machine.getHasCoinState());
    }

    public void returnCoin() {
        System.out.println("please insert one coin...");
        throw new RuntimeException();
    }

    public void turnCrank() {
        System.out.println("please insert one coin...");
        throw new RuntimeException();
    }

    public void reset() {
        System.out.println("please insert one coin...");
        throw new RuntimeException();
    }
}
