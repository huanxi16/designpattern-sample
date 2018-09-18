package com.lee.learn.dp.behavioralpattern.state.statemachine;

public class Machine {

    private int count = 0;

    private State currentState;

    private State noCoinState;
    private State hasCoinState;
    private State soldState;
    private State soldOutState;

    public Machine(int count) {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        this.count = count;
        if (count > 0) {
            this.currentState = noCoinState;
        } else {
            this.currentState = soldOutState;
        }
    }

    public void insertCoin() throws RuntimeException {
        currentState.insertCoin();
    }

    public void returnCoin() throws RuntimeException {
        System.out.println("user returns his coin...");
        currentState.returnCoin();
    }

    public void turnCrank() throws RuntimeException {
        currentState.turnCrank();
        currentState.reset();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public void setNoCoinState(State noCoinState) {
        this.noCoinState = noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public void setHasCoinState(State hasCoinState) {
        this.hasCoinState = hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }
}
