package com.lee.learn.dp.behavioralpattern.templatemethod;

public class Multiply extends AbstractCalculator implements Calculator {
    @Override
    public int calculate(int x, int y) {
        return x * y;
    }
}
