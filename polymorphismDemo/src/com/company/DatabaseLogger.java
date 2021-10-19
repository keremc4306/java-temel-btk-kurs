package com.company;

public class DatabaseLogger extends BaseLogger {
    public void log(String m) {
        System.out.println("Logged to db: " +m);
    }
}
