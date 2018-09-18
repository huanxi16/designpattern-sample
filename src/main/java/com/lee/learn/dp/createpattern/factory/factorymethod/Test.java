package com.lee.learn.dp.createpattern.factory.factorymethod;

import com.lee.learn.dp.createpattern.factory.factorymethod.factory.EmailSenderFactory;
import com.lee.learn.dp.createpattern.factory.factorymethod.factory.SenderFactory;
import com.lee.learn.dp.createpattern.factory.factorymethod.sender.Sender;

public class Test {

    public static void main(String[] args) {
        SenderFactory factory = new EmailSenderFactory();
        Sender sender = factory.createSender();
        sender.send();
    }
}
