package com.lee.learn.dp.behavioralpattern.responsibilitychain;

public interface Handler {
    void handle(Request request, Response response);

    interface Request {}

    interface Response {}
}
