package com.lee.learn.dp.behavioralpattern.visitor;

public interface Asset {
    void accept(Checker checker);
}
