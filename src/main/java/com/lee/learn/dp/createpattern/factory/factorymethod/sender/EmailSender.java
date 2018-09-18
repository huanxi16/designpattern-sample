package com.lee.learn.dp.createpattern.factory.factorymethod.sender;

public class EmailSender implements Sender {
    public void send() {
        System.out.println("Send email.");
    }
}
