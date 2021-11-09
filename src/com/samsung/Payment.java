package com.samsung;

// cache
// card
// stuff
public abstract class Payment extends Object implements PaymentInterface {
    public int amount;
    public String date;
    public boolean success = false;

    public Payment(int amount, String date) {
        this.amount = amount;
        this.date = date;
//        this.success = success;
    }

    @Override
    public void succeed() {
        success = true;
    }

    @Override
    public abstract String getType();
}
