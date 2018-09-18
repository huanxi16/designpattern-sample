package com.lee.learn.dp.createpattern.factory.simplefactory.commonfactory;

import com.lee.learn.dp.createpattern.factory.simplefactory.EmailSender;
import com.lee.learn.dp.createpattern.factory.simplefactory.Sender;
import com.lee.learn.dp.createpattern.factory.simplefactory.ShortMessageSender;

/**
 * create sender by parameter type
 * error type will make unmatched sender
 * Should modify this class if want to extend the sender type,
 * it violates the open close principle
 */
public class SenderFactory {
    public Sender createSender(String type) {
        if ("email".equalsIgnoreCase(type)) {
            return new EmailSender();
        } else if ("SMS".equalsIgnoreCase(type)) {
            return new ShortMessageSender();
        } else {
            return null;
        }
    }
}
