package com.lee.learn.dp.behavioralpattern.visitor;

public class Phone extends AbstractAsset implements Asset {
    public Phone(Long id, String owner) {
        this.id = id;
        this.owner = owner;
    }

    @Override
    public void accept(Checker checker) {
        checker.checkPhone(this);
    }
}
