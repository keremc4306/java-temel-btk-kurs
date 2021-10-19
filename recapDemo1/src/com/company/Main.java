package com.company;

public class Main {

    public static void main(String[] args) {
        // int s1 = 24;
        int s1 = 266;
        int s2 = 25;
        // int s3 = 2; -> Çıktı En büyük: 25 olur.
        int s3 = 26; // Çıktı En büyük: 26 olur.
        int theBiggest = s1;

        if (theBiggest < s2) {
            theBiggest = s2;
        }

        if (theBiggest < s3) {
            theBiggest = s3;
        }

        System.out.println("En büyük: " + theBiggest);
    }
}
