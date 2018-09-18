package com.lee.learn.dp.createpattern.factory.simplefactory.multimethodfactory;

import com.lee.learn.dp.createpattern.factory.simplefactory.EmailSender;
import com.lee.learn.dp.createpattern.factory.simplefactory.ShortMessageSender;

/**
 * Use different method to create different sender,
 * Should modify this class if want to extend the sender,
 * it violates the open close principle
 */
public class SenderFactory {
    public EmailSender createEmailSender() {
        return new EmailSender();
    }

    public ShortMessageSender createShortMessageSender() {
        return new ShortMessageSender();
    }
}
