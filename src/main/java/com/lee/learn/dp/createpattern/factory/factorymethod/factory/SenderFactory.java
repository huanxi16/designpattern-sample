package com.lee.learn.dp.createpattern.factory.factorymethod.factory;

import com.lee.learn.dp.createpattern.factory.factorymethod.sender.Sender;

/**
 * SenderFactory interface to be implemented to create each type sender.
 * Each implement just create one type sender.
 * If you want to extend more senders, you just implement new Sender and
 * new SenderFactory to create, without modifying existing classes
 */
public interface SenderFactory {
    Sender createSender();
}
