package com.lee.learn.dp.behavioralpattern.state.statemachine;

public class SoldState implements State {

    private Machine machine;

    public SoldState(Machine machine) {
        this.machine = machine;
    }

    public void insertCoin() {
        System.out.println("please waiting, toy is out for you...");
        throw new RuntimeException();
    }

    public void returnCoin() {
        System.out.println("please waiting, toy is out for you...");
        throw new RuntimeException();
    }

    public void turnCrank() {
        System.out.println("please waiting, toy is out for you...");
        throw new RuntimeException();
    }

    public void reset() {
        machine.setCount(machine.getCount() - 1);
        if (machine.getCount() > 0) {
            System.out.println("reset to init state...");
            machine.setCurrentState(machine.getNoCoinState());
        } else {
            System.out.println("toy is sold out...");
            machine.setCurrentState(machine.getSoldOutState());
        }
    }
}
