package com.lee.learn.dp.createpattern.factory.abstractfactory.factory;

import com.lee.learn.dp.createpattern.factory.abstractfactory.product.MicrosoftMouse;
import com.lee.learn.dp.createpattern.factory.abstractfactory.product.Product;

public class MicrosoftMouseFactory implements MouseFactory {
    public Product produce() {
        return new MicrosoftMouse();
    }
}
