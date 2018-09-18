package com.lee.learn.dp.structualpattern.facade;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        System.out.println("Car.run");
        car.stop();
    }
}
