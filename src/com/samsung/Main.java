package com.samsung;

public class Main {

    public static void main(String[] args) {
        Payment[] payments = new Payment[]{
                new CardPayment(100, "2021-01-01"),
                new CashPayment(100, "2021-01-01"),
                new CashPayment(100, "2021-01-01"),
                new CashPayment(100, "2021-01-01"),
                new Payment(10, "2021-01-01") {
                    @Override
                    public String getType() {
                        return "silver";
                    }
                },
                new CashPayment(100, "2021-01-01"),
                new CardPayment(100, "2021-01-01"),
                new CardPayment(100, "2021-01-01"),
                new CashPayment(100, "2021-01-01"),
                new Payment(200, "2021-01-01") {
                    @Override
                    public String getType() {
                        return "oil";
                    }
                },
                new Payment(300, "2021-01-01") {
                    @Override
                    public String getType() {
                        return "gas";
                    }
                },
        };
        for (Payment payment : payments) {
            System.out.println(payment.getClass().getName());
//            if (payment instanceof CardPayment) {
//                CardPayment cashPayment = (CardPayment) payment;
//                cashPayment.sendHTTPMoney();
//            }
//            System.out.println(payment.amount + " : " + payment.getType());
        }

//        CardPayment cardPayment = new CardPayment(100, "2021-01-01");
//        CashPayment cashPayment = new CashPayment(100, "2021-01-01");
//
//        System.out.println(cardPayment.getType());
//        System.out.println(cashPayment.getType());
    }
}
