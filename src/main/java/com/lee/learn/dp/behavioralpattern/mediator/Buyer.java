package com.lee.learn.dp.behavioralpattern.mediator;

public class Buyer {
    private Mediator mediator;

    public Buyer(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void buy() {
        mediator.call(this);
    }
}
