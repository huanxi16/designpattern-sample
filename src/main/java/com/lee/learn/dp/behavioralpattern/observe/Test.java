package com.lee.learn.dp.behavioralpattern.observe;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Observer tom = new Tom();
        Observer benjamin = new Benjamin();

        Subject bigEvent = new BigEvent();
        bigEvent.changed();

        bigEvent.registerObserver(tom);
        bigEvent.changed();

        bigEvent.registerObserver(benjamin);
        bigEvent.changed();

        bigEvent.unRegisterObserver(tom);
        bigEvent.changed();
    }
}
