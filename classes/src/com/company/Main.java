package com.company;

public class Main {

    public static void main(String[] args) {
        //classes are reference types
        CustomerManager customerManager;
        // new deyince heap'te nesne oluşturuyor.
        CustomerManager customerManager2 = new CustomerManager(); // define class from object
        customerManager = customerManager2;
        customerManager.add();
        customerManager.remove();
        customerManager.update();
    }
}
