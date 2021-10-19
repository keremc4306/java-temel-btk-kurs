package com.company;

public class Main {

    public static void main(String[] args) {
	    //int s = 14; -> if'in içindeki mesaj çalışır.
        int s = 24; // else'in içindeki mesaj çalışır.
        if (s < 20) {
            System.out.println("Sayı 20'den küçüktür.");
        }
        else if(s == 20) {
            System.out.println("Sayı 20'ye eşittir.");
        }
        else {
            System.out.println("Sayı 20'den küçük değildir.");
        }

        // Farklı senaryolarda veri kaçaklarını önlemek için buna defensive programming deniyor.
    }
}
