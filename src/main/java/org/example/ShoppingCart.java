package org.example;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Double> items = new HashMap<>();

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
}
