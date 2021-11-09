package com.samsung;

public class Order {
    public String date;
    public String status;

    public Item[] items;


    public Order(String date, String status, Item[] items) {
        this.date = date;
        this.status = status;
        this.items = items;
    }

    public double calcTax() {
        return calcTotal() * 0.05;
    }

    public double calcTotal() {
        double sum = 0;
        for (Item item : items) {
            sum += item.price;
        }
        return sum;
    }
}
