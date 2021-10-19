package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("book", "kitap");
        dictionary.put("table", "masa");
        dictionary.put("computer", "bilgisayar");
        System.out.println(dictionary.size());

        for (String item : dictionary.keySet()){
            System.out.println("Eleman-"+item+" Değer-"+dictionary.get(item));
        }


        dictionary.remove("table");
        dictionary.clear();
        System.out.println(dictionary.get("table"));
    }
}
