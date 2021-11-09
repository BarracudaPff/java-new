package com.samsung;

public class CashPayment extends Payment {
    public CashPayment(int amount, String date) {
        super(amount, date);
    }

    @Override
    public String getType() {
        return "cash";
    }
}
