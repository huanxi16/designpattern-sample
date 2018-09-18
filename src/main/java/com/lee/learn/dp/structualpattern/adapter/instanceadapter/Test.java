package com.lee.learn.dp.structualpattern.adapter.instanceadapter;

public class Test {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable adapter = new Adapter(source);
        adapter.methodA();
        adapter.methodB();
    }
}
