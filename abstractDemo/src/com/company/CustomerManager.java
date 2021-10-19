package com.company;

public class CustomerManager {
    BaseDbManager dbManager; // Base sınıf strateji görevi görüyor.

    public void getCustomers(){
        dbManager.getData();
    }

}
