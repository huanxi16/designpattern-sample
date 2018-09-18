package com.lee.learn.dp.structualpattern.decorator;

public class Test {
    public static void main(String[] args) {
        Sourceable sourceable = new Source();
        Sourceable decorator = new Decorator(sourceable);
        decorator.run();
    }
}
