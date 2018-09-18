package com.lee.learn.dp.behavioralpattern.iterate;

import java.util.NoSuchElementException;

public class List<E> implements Collection {

    private E[] data;

    public List(E[] data) {
        this.data = data;
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }

    @Override
    public void add(Object o) {

    }

    @Override
    public void addAll(Collection collection) {

    }

    @Override
    public Object remove(Object o) {
        return null;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return false;
    }

    private class Itr implements Iterator<E> {

        private int cursor;

        private int lastRet = -1;

        Itr() {}

        @Override
        public boolean hasNext() {
            return cursor != size();
        }

        @Override
        public E next() {
            int i = cursor;
            if (i > size()) {
                throw new NoSuchElementException();
            }
            return data[cursor++];
        }

        @Override
        public boolean remove() {
            return false;
        }
    }

}
