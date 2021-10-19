package com.company;

public class Main {

    public static void main(String[] args) {
	    //char grade = 'A'; -> Mükemmel, geçtiniz sonucu çıkar.
        //char grade = 'H'; -> Geçersiz not çıkar
        char grade = 'B'; // B ve C için aynı durumu tanımlarsak sonuç İyi, geçtiniz çıkar

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel, geçtiniz");
                break;
            /*
            case 'B':
                System.out.println("Çok güzel, geçtiniz");
                break;
            case 'C':
                System.out.println("İyi, geçtiniz");
                break;
             */

            case 'B':
            case 'C':
                System.out.println("İyi, geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil, geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not");
        }
    }
}
