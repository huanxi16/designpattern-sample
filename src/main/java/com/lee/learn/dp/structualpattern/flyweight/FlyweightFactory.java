package com.lee.learn.dp.structualpattern.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {
    private static Map<Object, Flyweight> cache = new HashMap<>();

    public static Flyweight getFlyweight(Object key) {
        Flyweight flyweight = cache.get(key);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(key);
            cache.put(key, flyweight);
        }
        return flyweight;
    }

    private static class Inner {
        private static FlyweightFactory flyweightFactory = new FlyweightFactory();
    }

    public static FlyweightFactory getFlyweightFactory() {
        return Inner.flyweightFactory;
    }
}
