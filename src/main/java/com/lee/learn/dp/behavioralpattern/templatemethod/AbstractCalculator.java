package com.lee.learn.dp.behavioralpattern.templatemethod;

public abstract class AbstractCalculator {

    public final int calculate(String param, String opt) {
        int[] intArr = split(param, opt);
        if (intArr == null || intArr.length != 2) {
            throw new IllegalArgumentException();
        }
        return calculate(intArr[0], intArr[1]);
    }

    protected abstract int calculate(int param1, int param2);

    private int[] split(String param, String opt) {
        String[] array = param.split(opt);
        int[] intArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArr[i] = Integer.parseInt(array[i]);
        }

        return intArr;
    }

}
