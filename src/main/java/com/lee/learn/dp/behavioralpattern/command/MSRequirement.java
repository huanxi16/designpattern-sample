package com.lee.learn.dp.behavioralpattern.command;

public class MSRequirement implements Requirement {

    private Developer developer;

    public MSRequirement(Developer developer) {
        this.developer = developer;
    }

    @Override
    public boolean develop() {
        return developer.develop(this);
    }
}
