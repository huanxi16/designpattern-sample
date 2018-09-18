package com.lee.learn.dp.behavioralpattern.mediator;

public class Test {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Buyer buyer = new Buyer(mediator);
        Seller seller = new Seller(mediator);

        mediator.setBuyer(buyer);
        mediator.setSeller(seller);

        buyer.buy();
        System.out.println("---");
        seller.sell();
    }
}
