package com.lee.learn.dp.behavioralpattern.mediator;

public class Mediator {
    private Seller seller;
    private Buyer buyer;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void call(Object object) {
        if (object instanceof Buyer) {
            System.out.println("Someone want to buy, I should find someone else want to sell.");
        } else if (object instanceof Seller) {
            System.out.println("Someone want to sell, I should find someone else want to buy.");
        }
    }
}
