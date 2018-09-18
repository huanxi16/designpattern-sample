package com.lee.learn.dp.behavioralpattern.memento;

public class Memento {
    private Object data;

    public Memento(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
