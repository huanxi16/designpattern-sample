package com.lee.learn.dp.structualpattern.adapter.instanceadapter;

/**
 * 将一个对象转换成满足另一个接口的对象
 */
public class Adapter implements Targetable {

    private Source source;
    public Adapter(Source source) {
        this.source = source;
    }

    public void methodA() {
        source.methodA();
    }

    public void methodB() {
        System.out.println("Adapter: target methodB");
    }
}
