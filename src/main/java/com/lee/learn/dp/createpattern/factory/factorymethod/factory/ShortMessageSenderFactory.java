package com.lee.learn.dp.createpattern.factory.factorymethod.factory;

import com.lee.learn.dp.createpattern.factory.factorymethod.sender.Sender;
import com.lee.learn.dp.createpattern.factory.factorymethod.sender.ShortMessageSender;

public class ShortMessageSenderFactory implements SenderFactory {
    public Sender createSender() {
        return new ShortMessageSender();
    }
}
