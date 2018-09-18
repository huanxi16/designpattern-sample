package com.lee.learn.dp.behavioralpattern.state.statemachine;

/**
 * Interface of the possible states of machine
 */
public interface State {

    /**
     * Inserting coin to make the state transforming to hasCoinState from noCoinState
     */
    void insertCoin() throws RuntimeException;

    /**
     * Return coin to make the state transforming to noCoinState from hasCoinState
     */
    void returnCoin() throws RuntimeException;

    /**
     * Turning crank to make the state transforming to soldingState from hasCoinState
     */
    void turnCrank() throws RuntimeException;

    /**
     * Inner operation, make the state transforming to soldOutState or noCoinState from soldingState
     */
    void reset() throws RuntimeException;
}
