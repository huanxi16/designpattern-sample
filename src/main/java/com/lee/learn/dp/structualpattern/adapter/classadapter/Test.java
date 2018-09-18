package com.lee.learn.dp.structualpattern.adapter.classadapter;

public class Test {
    public static void main(String[] args) {
        Targetable adapter = new Adapter();
        adapter.methodA();
        adapter.methodB();
    }
}
