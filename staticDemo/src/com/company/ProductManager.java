package com.company;

// Ürünü veritabanına ekleyen nesne
public class ProductManager {
    public void add(Product product) {
        if (ProductValidator.isValid(product)) {
            System.out.println("It was added");
        }
        else {
            System.out.println("Product details are invalid");
        }
    }
}
