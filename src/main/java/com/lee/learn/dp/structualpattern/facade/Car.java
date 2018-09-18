package com.lee.learn.dp.structualpattern.facade;

public class Car {
    private Engine engine;
    private AirConditioner airConditioner;
    private Light light;

    public Car() {
        this.engine = new Engine();
        this.airConditioner = new AirConditioner();
        this.light = new Light();
    }

    public void start() {
        System.out.println("Car.start");
        engine.start();
        airConditioner.start();
        light.turnOn();
        System.out.println("Car.start.over");
    }

    public void stop() {
        System.out.println("Car.stop");
        airConditioner.stop();
        engine.stop();
        light.turnOff();
        System.out.println("Car.stop.over");
    }
}
