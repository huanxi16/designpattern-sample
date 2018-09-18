package com.lee.learn.dp.structualpattern.proxy;

public class Test {
    public static void main(String[] args) {
        Targetable service = new Service();
        Targetable proxy = new Proxy(service);
        proxy.run();

        Targetable proxy2 = new Proxy();
        proxy2.run();
    }
}
