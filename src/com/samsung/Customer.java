package com.samsung;

public class Customer {
    public String name;
    public Order[] orders;

    public Customer(String name, Order[] orders) {
        this.name = name;
        this.orders = orders;
    }

    public double total() {
        double sum = 0;
        for (Order order : orders) {
            if (order.status.equals("waiting_payment")) {
                sum += order.calcTotal() + order.calcTax();
            }
        }
        return sum;
    }
}
