package com.lee.learn.dp.structualpattern.adapter.interfaceadapter;

import java.util.Collection;
import java.util.function.Consumer;

/**
 * define several method in this interface.
 * however, not all the implementation would like to implement these method,
 * so interface adapter pattern is helpful,
 * you can create an abstract class that implements all the method,
 * implementation just extend the abstract class
 * @param <E>
 */
public interface List<E> {
    int size();

    boolean isEmpty();

    void add(E e);

    void addAll(Collection<E> collections);

    void forEach(Consumer<E> consumer);

    void remove(E e);

    void clear();
}
