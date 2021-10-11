/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex44;

import com.google.gson.Gson;

import java.util.HashMap;

public class Inventory {
    private final HashMap<String, Product> products = new HashMap<>();

    public Inventory(String productJSON) {
        ExerciseInput parsed = new Gson().fromJson(productJSON, ExerciseInput.class);
        for (Product product : parsed.getProducts()) {
            products.put(product.getName(), product);
        }
    }

    public Product getProduct(String productName) {
        return products.get(productName);
    }

    public boolean productExists(String productName) {
        return products.containsKey(productName);
    }

    public String getProductReport(String productName) {
        if (productExists(productName)) {
            return getProduct(productName).getProductReport();
        } else {
            return "Sorry, that product was not found in our inventory.";
        }
    }

}
