package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    ShoppingCart shoppingCartItems;

    @BeforeEach
    void setUp() {
        shoppingCartItems = new ShoppingCart();
    }

    @Test
    void addItem() {
        shoppingCartItems.addItem("Cap", 9.99);
        shoppingCartItems.addItem("Hoodie", 10.99);
        shoppingCartItems.addItem("Jeans", 19.99);
        shoppingCartItems.addItem("Socks", 25.99);

        assertAll(
                () -> assertEquals(9.99, shoppingCartItems.getItems().get("Cap")),
                () -> assertEquals(10.99, shoppingCartItems.getItems().get("Hoodie")),
                () -> assertEquals(19.99, shoppingCartItems.getItems().get("Jeans")),
                () -> assertEquals(25.99, shoppingCartItems.getItems().get("Socks"))
        );
    }

    @Test
    void calculateTotalPrice() {
        shoppingCartItems.addItem("Cap", 9.99);
        shoppingCartItems.addItem("Hoodie", 10.99);

        assertEquals(20.98, shoppingCartItems.calculateTotalPrice());
    }

    @Test
    @DisplayName("Test adding a discount")
    void testApplyDiscount(){
        shoppingCartItems.applyDiscount(0.3);
        assertEquals(0.3, shoppingCartItems.getDiscount());

    }
}