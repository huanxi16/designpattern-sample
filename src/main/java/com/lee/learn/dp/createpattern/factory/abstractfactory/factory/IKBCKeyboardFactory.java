package com.lee.learn.dp.createpattern.factory.abstractfactory.factory;

import com.lee.learn.dp.createpattern.factory.abstractfactory.product.IKBCKeyboard;
import com.lee.learn.dp.createpattern.factory.abstractfactory.product.Product;

public class IKBCKeyboardFactory implements KeyboardFactory {
    public Product produce() {
        return new IKBCKeyboard();
    }
}
