package com.example.mochaalaa.Activity;

import java.util.ArrayList;
import java.util.List;

public class ManagmentCart {
    private static ManagmentCart instance;
    private List<ItemTry> cartItems;

    private ManagmentCart() {
        cartItems = new ArrayList<>();
    }

    public static ManagmentCart getInstance() {
        if (instance == null) {
            instance = new ManagmentCart();
        }
        return instance;
    }

    public void addItem(ItemTry item) {
        cartItems.add(item);
    }

    public List<ItemTry> getCartItems() {
        return cartItems;
    }

    public void clearCart() {
        cartItems.clear();
    }
}
