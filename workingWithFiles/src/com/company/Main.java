package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //createFile();
        //getFileInto();
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("E:\\BTKAkademi\\JavaBTKAkademi\\javademos\\files\\teams.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("The file was created.");
            } else {
                System.out.println("The file is available");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInto() {
        File file = new File("E:\\BTKAkademi\\JavaBTKAkademi\\javademos\\files\\teams.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File can be written: " + file.canWrite());
            System.out.println("File can be read: " + file.canRead());
            System.out.println("File size: " + file.length());
        }
    }

    public static void readFile() {
        File file = new File("E:\\BTKAkademi\\JavaBTKAkademi\\javademos\\files\\teams.txt");
        try {
            Scanner reader = new Scanner(file);
            //while satır dönene kadar bu işlemi yapacak
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close(); // Dosyayı bellekten uçuruyor.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Dosyanın üzerine yazma işlemi
    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\BTKAkademi\\JavaBTKAkademi\\javademos\\files\\teams.txt", true));
            writer.newLine();
            writer.write("Trabzonspor");
            System.out.println("It was written to file.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
