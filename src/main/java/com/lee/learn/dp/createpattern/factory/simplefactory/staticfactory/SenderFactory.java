package com.lee.learn.dp.createpattern.factory.simplefactory.staticfactory;

import com.lee.learn.dp.createpattern.factory.simplefactory.EmailSender;
import com.lee.learn.dp.createpattern.factory.simplefactory.ShortMessageSender;

/**
 * Use static method to create sender, no need to instantiate factory instance
 * Should modify this class if want to extend the sender,
 * it violates the open close principle
 */
public class SenderFactory {
    private SenderFactory() {}

    public static EmailSender createEmailSender() {
        return new EmailSender();
    }

    public static ShortMessageSender createShortMessageSender() {
        return new ShortMessageSender();
    }
}
