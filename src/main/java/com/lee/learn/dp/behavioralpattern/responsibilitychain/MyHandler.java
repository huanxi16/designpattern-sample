package com.lee.learn.dp.behavioralpattern.responsibilitychain;

public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void handle(Request request, Response response) {
        handleInternal(request, response);
        Handler handler = getHandler();
        if (handler != null) {
            handler.handle(request, response);
        }
    }

    private void handleInternal(Request request, Response response) {

    }
}
