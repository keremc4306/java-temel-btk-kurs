package com.company;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"Laptop", "Asus Laptop", 3000, 2, "Black");

        /*
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(10);
        */

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getCode());

    }
}
