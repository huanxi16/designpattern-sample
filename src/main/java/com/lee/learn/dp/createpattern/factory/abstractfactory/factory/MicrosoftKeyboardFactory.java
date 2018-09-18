package com.lee.learn.dp.createpattern.factory.abstractfactory.factory;

import com.lee.learn.dp.createpattern.factory.abstractfactory.product.MicrosoftKeyboard;
import com.lee.learn.dp.createpattern.factory.abstractfactory.product.Product;

public class MicrosoftKeyboardFactory implements KeyboardFactory {
    public Product produce() {
        return new MicrosoftKeyboard();
    }
}
