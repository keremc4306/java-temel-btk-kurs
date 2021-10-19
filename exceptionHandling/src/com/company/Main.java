package com.company;

public class Main {

    public static void main(String[] args) {
	    try {
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[4]);
        }catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }/*catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }*/catch (Exception exception) {
            System.out.println("Loglandı: " + exception);
        }
        finally {
            System.out.println("Ben her türlü çalışırım.");
        }

    }
}
