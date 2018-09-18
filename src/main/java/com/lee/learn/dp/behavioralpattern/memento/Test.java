package com.lee.learn.dp.behavioralpattern.memento;

public class Test {
    public static void main(String[] args) {
        OriginalClass original = new OriginalClass("password");
        System.out.println(original.getData());

        Storage storage = new Storage(original.backup());
        original.setData("username");
        System.out.println(original.getData());

        original.restore(storage.getMemento());
        System.out.println(original.getData());
    }
}
