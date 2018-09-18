package com.lee.learn.dp.structualpattern.decorator;

public class Source implements Sourceable {
    @Override
    public void run() {
        System.out.println("Source.run()");
    }
}
