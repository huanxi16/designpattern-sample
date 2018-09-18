package com.lee.learn.dp.createpattern.factory.simplefactory;

public class EmailSender implements Sender {
    public void send() {
        System.out.println("Send Email.");
    }
}
