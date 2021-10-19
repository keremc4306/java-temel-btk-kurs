package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList numbers = new ArrayList(); // ArrayList içerisine her türlü elemanı alır.
        numbers.add(1);
        numbers.add(10);
        numbers.add("Ankara");
        //System.out.println(numbers.size()); -> ArrayList'te kaç eleman olduğunu bize söyler.
        //numbers.set(0, 100);

        //numbers.remove(0);

        for(Object i:numbers) {
            System.out.println(i);
        }
    }
}
