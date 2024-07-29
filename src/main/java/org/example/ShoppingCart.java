package org.example;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Double> items = new HashMap<>();
    double discount = 0.0;

    public double getDiscount() {
        return discount;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public void addItem(String itemName, Double itemPrice) {
        items.put(itemName,itemPrice);
    }

    public double calculateTotalPrice() {
        double result = 0.00D;
        for (double key : items.values()) {
            result += key;
        }
        return result;
    }

    public void applyDiscount(double discount){
        this.discount = discount;
    }
}
