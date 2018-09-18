package com.lee.learn.dp.behavioralpattern.visitor;

public class AssetOwner implements Checker {

    private String name;

    public AssetOwner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void checkComputer(Asset asset) {
        System.out.println(this.getName() + ": checkComputer");
    }

    @Override
    public void checkPhone(Asset asset) {
        System.out.println(this.getName() + ": checkPhone");
    }
}
