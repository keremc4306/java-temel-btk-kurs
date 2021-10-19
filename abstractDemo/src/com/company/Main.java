package com.company;

public class Main {

    public static void main(String[] args) {
	    CustomerManager customerManager = new CustomerManager();
        customerManager.dbManager = new OracleDbManager();
        // customerManager.dbManager = new SqlServerDbManager();
        customerManager.getCustomers();
    }
}
