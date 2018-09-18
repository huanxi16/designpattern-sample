package com.lee.learn.dp.structualpattern.adapter.classadapter;

/**
 * 将一个类转换成满足另一个接口的类
 */
public class Adapter extends Source implements Targetable {
    public void methodB() {
        System.out.println("Adapter: target methodB");
    }
}
