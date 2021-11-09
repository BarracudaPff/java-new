package com.samsung;

public class CardPayment extends Payment {
    public CardPayment(int amount, String date) {
        super(amount, date);
    }

    public void sendHTTPMoney() {
        System.out.println("Sending " + amount + " money...");
        success = true;
    }

    @Override
    public String getType() {
        return "card";
    }
}
