package com.lee.learn.dp.createpattern.factory.factorymethod.sender;

public class ShortMessageSender implements Sender {
    public void send() {
        System.out.println("Send short message.");
    }
}
