package com.lee.learn.dp.behavioralpattern.iterate;

import java.util.function.Consumer;

public interface Iterator<E> {

    boolean hasNext();

    E next();

    boolean remove();

    default void forEachRemaining(Consumer<? super E> function) {
        while (hasNext()) {
            function.accept(next());
        }
    }
}
