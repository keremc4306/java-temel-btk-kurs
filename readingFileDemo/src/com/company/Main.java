package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("E:\\BTKAkademi\\JavaBTKAkademi\\javademos\\readingFileDemo\\src\\com\\company\\numbers.txt"));
            String line = null;
            while((line= reader.readLine()) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println("Total = " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {

            }
        }
    }
}
