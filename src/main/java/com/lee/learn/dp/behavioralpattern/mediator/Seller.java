package com.lee.learn.dp.behavioralpattern.mediator;

public class Seller {
    private Mediator mediator;

    public Seller(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sell() {
        mediator.call(this);
    }
}
