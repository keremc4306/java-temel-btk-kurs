package com.company;

public class Main {

    public static void main(String[] args) {
        String nms = giveCity();
        System.out.println(nms);
        int number = addition(15,7);
        System.out.println(number);
        int total = addition2(2,3,4);
        System.out.println(total);
        //sayiBulmaca();
    }

    /*
    public static void sayiBulmaca() {
        int[] numbers = new int[]{1,2,5,7,9,0};
        int aranacak = 6;
        boolean isAv = false;

        for (int number : numbers) {
            if (number == aranacak) {
                isAv = true;
                break;
            }
        }

        if (isAv) {
            giveMessage("The number is available: " + aranacak);
        }
        else {
            giveMessage("The number is not available: " + aranacak);
        }
    }
     */

    public static int addition(int a1,int a2){
        return a1 + a2;
    }

    public static  int addition2(int... numbers){
        int total =0;
        for (int number : numbers){
            total += number;
        }

        return total;
    }

    public static String giveCity(){
        return "Ankara";
    }
}
