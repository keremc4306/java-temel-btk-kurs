package com.company;

public class ConsoleLogger extends BaseLogger{
    public void log(String m) {
        System.out.println("Logged to console: " +m);
    }
}
