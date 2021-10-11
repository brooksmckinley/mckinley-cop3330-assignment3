/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProduct {
    @Test
    public void testProductConstructorAndGetters() {
        Product testProduct = new Product("name", 1.0, 3);
        Assertions.assertEquals("name", testProduct.getName());
        Assertions.assertEquals(1.0, testProduct.getPrice());
        Assertions.assertEquals(3, testProduct.getQuantity());
    }

    @Test
    public void testProductReport() {
        Product testProduct = new Product("name", 1.3333333, 3);
        Assertions.assertEquals("""
                Name: name
                Price: 1.33
                Quantity: 3
                """, testProduct.getProductReport());
        Product anotherTestProduct = new Product("anotherone", 99, 1);
        Assertions.assertEquals("""
                Name: anotherone
                Price: 99.00
                Quantity: 1
                """, anotherTestProduct.getProductReport());
    }
}
