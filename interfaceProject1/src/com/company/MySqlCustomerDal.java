package com.company;

public class MySqlCustomerDal implements ICustomerDal {

    @Override
    public void add() {
        System.out.println("Data was added to MySql db");
    }
}
