package com.lee.learn.dp.createpattern.factory.factorymethod.factory;

import com.lee.learn.dp.createpattern.factory.factorymethod.sender.EmailSender;
import com.lee.learn.dp.createpattern.factory.factorymethod.sender.Sender;

public class EmailSenderFactory implements SenderFactory {
    public Sender createSender() {
        return new EmailSender();
    }
}
