package com.company;

public class OracleCustomerDal implements ICustomerDal {

    @Override
    public void add() {
        System.out.println("Data was added to Oracle db");
    }
}
