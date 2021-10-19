package com.company;

public class AccountManager {
    private double balance; //balance: Kişinin hesabındaki para miktarı

    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInsufficientException {
        //withdraw: Hesaptan para çekmek
        if (balance > amount) {
            balance = getBalance() - amount;
        }
        else {
            throw new BalanceInsufficientException("Insufficient balance");
        }
    }

    //Hesaptaki parayı okumamızı sağlıyor.
    public double getBalance() {
        return balance;
    }
}
