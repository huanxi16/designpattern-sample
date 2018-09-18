package com.lee.learn.dp.behavioralpattern.templatemethod;

public class Test {
    public static void main(String[] args) {
        Calculator plus = new Plus();
        int result = ((Plus) plus).calculate("12+8", "\\+");
        System.out.println("12+8=" + result);

        Calculator minus = new Minus();
        result = ((Minus) minus).calculate("12-8", "\\-");
        System.out.println("12-8=" + result);

        Calculator multiply = new Multiply();
        result = ((Multiply) multiply).calculate("10*10", "\\*");
        System.out.println("10*10=" + result);
    }
}
