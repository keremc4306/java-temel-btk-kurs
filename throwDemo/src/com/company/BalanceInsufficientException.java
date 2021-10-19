package com.company;

public class BalanceInsufficientException extends Exception{
    String m;
    public BalanceInsufficientException(String m) {
        this.m = m;
    }

    @Override
    public String getMessage() {
        return this.m;
    }
}
