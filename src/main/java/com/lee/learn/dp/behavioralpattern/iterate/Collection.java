package com.lee.learn.dp.behavioralpattern.iterate;

public interface Collection<E> {

    Iterator<E> iterator();

    void add(E e);

    void addAll(Collection collection);

    E remove(E e);

    boolean removeAll(Collection collection);

    void clear();

    int size();

    boolean isEmpty();

    boolean contains(E e);

    boolean containsAll(Collection collection);
}
