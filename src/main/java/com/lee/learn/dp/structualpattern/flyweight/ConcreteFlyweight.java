package com.lee.learn.dp.structualpattern.flyweight;

public class ConcreteFlyweight implements Flyweight {

    private Object internalStates;

    public ConcreteFlyweight(Object internalStates) {
        this.internalStates = internalStates;
    }

    @Override
    public void operation(Object... externalStates) {
        System.out.println("operate external state");
    }
}
