package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "Kerem", "Candangil"));
        customers.add(new Customer(2, "Kutay", "Özkoç"));
        customers.add(new Customer(3, "Barış", "Önen"));

        for (Customer customer:customers) {
            System.out.println(customer.firstName);
        }
    }
}
