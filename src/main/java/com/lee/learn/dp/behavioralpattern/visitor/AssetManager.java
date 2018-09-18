package com.lee.learn.dp.behavioralpattern.visitor;

public class AssetManager implements Checker {
    @Override
    public void checkComputer(Asset asset) {
        System.out.println("AssetManager.checkComputer");
    }

    @Override
    public void checkPhone(Asset asset) {
        System.out.println("AssetManager.checkPhone");
    }
}
