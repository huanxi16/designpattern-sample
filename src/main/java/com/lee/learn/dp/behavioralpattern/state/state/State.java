package com.lee.learn.dp.behavioralpattern.state.state;

public class State {
    private String state;

    public void execute() {
        System.out.println("State.execute");
    }

    public void run() {
        System.out.println("State.run");
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
