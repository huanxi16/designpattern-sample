package com.lee.learn.dp.behavioralpattern.visitor;

public class Computer extends AbstractAsset implements Asset {
    public Computer(Long id, String owner) {
        this.id = id;
        this.owner = owner;
    }

    @Override
    public void accept(Checker checker) {
        checker.checkComputer(this);
    }
}
