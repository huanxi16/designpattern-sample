package com.lee.learn.dp.structualpattern.adapter.interfaceadapter;

import java.util.Collection;
import java.util.function.Consumer;

/**
 * 当不希望实现一个接口中所有的方法
 * @param <E>
 */
public abstract class AbstractList<E> implements List<E> {
    public AbstractList() {}

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void add(E e) {

    }

    @Override
    public void addAll(Collection<E> collections) {

    }

    @Override
    public void forEach(Consumer<E> consumer) {

    }

    @Override
    public void remove(E e) {

    }

    @Override
    public void clear() {

    }
}
