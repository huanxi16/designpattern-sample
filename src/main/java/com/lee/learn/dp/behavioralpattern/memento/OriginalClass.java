package com.lee.learn.dp.behavioralpattern.memento;

public class OriginalClass {

    private Object data;

    public OriginalClass(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Memento backup() {
        return new Memento(data);
    }

    public void restore(Memento memento) {
        this.data = memento.getData();
    }
}
