package com.jobinterview;

public class Main {

    public static void main(String[] args) {

        DiscountCard bronzeDiscountCard = new BronzeCard("Martin Lazarov");
        DiscountCard silverDiscountCard = new SilverCard("Silver Surfer");
        DiscountCard goldDiscountCard = new GoldCard("Golden Eye");

        PayDesk.checkout(150, bronzeDiscountCard, 0);
        System.out.println("-------------------------------------------------");
        PayDesk.checkout(850, silverDiscountCard, 600);
        System.out.println("-------------------------------------------------");
        PayDesk.checkout(1300, goldDiscountCard, 1500);
        System.out.println("-------------------------------------------------");

    }
}
