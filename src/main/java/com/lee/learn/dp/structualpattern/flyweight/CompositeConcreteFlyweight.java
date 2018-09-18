package com.lee.learn.dp.structualpattern.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompositeConcreteFlyweight implements Flyweight {
    Map<Object, Flyweight> maps = new HashMap<>();

    public void add(Object key, Flyweight flyweight) {
        maps.put(key, flyweight);
    }

    @Override
    public void operation(Object... externalStates) {
        for (Map.Entry<Object, Flyweight> entry : maps.entrySet()) {
            entry.getValue().operation(externalStates);
        }
    }
}
