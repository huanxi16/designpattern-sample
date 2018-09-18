package com.lee.learn.dp.structualpattern.decorator;

/**
 * 动态的为一个对象增加功能，而且还能动态撤销,
 * 继承不能做到这一点，继承的功能是静态的，不能动态增删
 */
public class Decorator implements Sourceable {
    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    @Override
    public void run() {
        System.out.println("Decorator.before");
        sourceable.run();
        System.out.println("Decorator.after");
    }
}
