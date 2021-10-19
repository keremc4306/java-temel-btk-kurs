package com.company;

public class EmailLogger extends BaseLogger {
    public void log(String m) {
        System.out.println("Logged to email: " +m);
    }
}
