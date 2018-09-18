package com.lee.learn.dp.createpattern.singleton;

public class BestSingleton {
    private BestSingleton() {}

    public static BestSingleton getInstance() {
        return Singleton.bestSingleton;
    }

    private static class Singleton {
        private static BestSingleton bestSingleton = new BestSingleton();
    }

    public Object readResolve() {
        return getInstance();
    }
}
