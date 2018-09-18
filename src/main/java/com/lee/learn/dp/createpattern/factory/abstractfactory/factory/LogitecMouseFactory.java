package com.lee.learn.dp.createpattern.factory.abstractfactory.factory;

import com.lee.learn.dp.createpattern.factory.abstractfactory.product.LogitecMouse;
import com.lee.learn.dp.createpattern.factory.abstractfactory.product.Product;

public class LogitecMouseFactory implements MouseFactory {
    public Product produce() {
        return new LogitecMouse();
    }
}
