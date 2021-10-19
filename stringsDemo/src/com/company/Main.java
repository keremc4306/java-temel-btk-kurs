package com.company;

public class Main {

    public static void main(String[] args) {
	    String ms = "The weather is beautiful.";
        /*System.out.println(ms);
        System.out.println("The number of elements: " + ms.length());
        System.out.println("5. elements: " + ms.charAt(4));
        System.out.println(ms.concat(" Let's go on a picnic."));
        System.out.println(ms.startsWith("T"));
        System.out.println(ms.endsWith("k"));
        char[] characters = new char[5];
        ms.getChars(4,9, characters, 0);
        System.out.println(characters);
        System.out.println(ms.indexOf("ea"));
        System.out.println(ms.lastIndexOf("is"));*/
        System.out.println(ms.replace(' ', '-'));
        System.out.println(ms.substring(4,11));

        for(String word:ms.split(" ")) {
            System.out.println(word);
        }
    }
}
