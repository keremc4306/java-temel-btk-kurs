package com.company;

public class ProductValidator {

    static {
        System.out.println("Static block");
    }

    public ProductValidator() {
        System.out.println("Constructor block");
    }
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
