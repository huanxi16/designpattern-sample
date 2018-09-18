package com.lee.learn.dp.behavioralpattern.interpreter;

public class Add implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
