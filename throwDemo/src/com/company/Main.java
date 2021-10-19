package com.company;

public class Main {

    public static void main(String[] args) {
	    AccountManager acm = new AccountManager();
        System.out.println("Account: " + acm.getBalance()); // Para yatırmadan önce
        acm.deposit(100);
        System.out.println("Account: " + acm.getBalance()); // Para yatırdıktan önce
        try {
            acm.withdraw(90);
        }catch (BalanceInsufficientException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Account: " + acm.getBalance()); // Hesaptan 90 TL çekildikten sonra
        try {
            acm.withdraw(90);
        }catch (BalanceInsufficientException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Account: " + acm.getBalance());
    }
}
