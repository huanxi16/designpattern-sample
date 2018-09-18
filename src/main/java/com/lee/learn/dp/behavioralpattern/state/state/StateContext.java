package com.lee.learn.dp.behavioralpattern.state.state;

/**
 * This is also state pattern while its state is indicated by a string in state,
 * but no state transition.
 * In this sample, context invokes the method call by state, but with no state transition.
 */
public class StateContext {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void call() {
        if ("exe".equalsIgnoreCase(state.getState())) {
            state.execute();
        } else if ("run".equalsIgnoreCase(state.getState())) {
            state.run();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
