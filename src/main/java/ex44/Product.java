/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex44;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // No-args constructor for GSON
    public Product(){}

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductReport() {
        return String.format("""
                Name: %s
                Price: %.2f
                Quantity: %d
                """, this.getName(), this.getPrice(), this.getQuantity());
    }
}
