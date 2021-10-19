package com.company;

public class FileLogger extends BaseLogger {
    public void log(String m) {
        System.out.println("Logged to file: " +m);
    }
}
