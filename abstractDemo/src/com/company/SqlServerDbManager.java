package com.company;

public class SqlServerDbManager extends BaseDbManager{

    @Override
    public void getData() {
        System.out.println("Sql Server tarafından veri getirildi.");
    }
}
