package com.lee.learn.dp.structualpattern.adapter.interfaceadapter;

public class Test {
    public static void main(String[] args) {
        List<?> pigs = new PigList();
        pigs.size();

        List<?> ant = new AntList();
        ant.clear();
    }
}
