package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> ct = new ArrayList<String>();
        ct.add("Ankara");
        ct.add("Eskişehir");
        ct.add("Kütahya");
        ct.add("Bursa");

        ct.remove(2);

        Collections.sort(ct);
        for (String city:ct) {
            System.out.println(city);
        }
    }
}
