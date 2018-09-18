package com.lee.learn.dp.behavioralpattern.visitor;

public abstract class AbstractAsset implements Asset {

    protected Long id;

    protected String owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
