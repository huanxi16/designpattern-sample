package com.lee.learn.dp.structualpattern.proxy;

public class Proxy implements Targetable {
    private Targetable targetable;

    public Proxy(Targetable targetable) {
        this.targetable = targetable;
    }

    public Proxy() {
        this.targetable = new Service();
    }

    @Override
    public String run() {
        before();
        String retValue = targetable.run();
        after();
        return retValue;
    }

    private void before() {
        System.out.println("Proxy.before");
    }

    private void after() {
        System.out.println("Proxy.after");
    }
}
