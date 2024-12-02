package com.jspider.program.src.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program14 {
    public static void main(String[] args)throws Exception {
        System.out.println("Program starts !!");
        try {
            FileReader fr=new FileReader("d:\\p2.txt");
            int x=fr.read();
            while(x!=-1) {
                System.out.print((char)x);
                x=fr.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is Not Found");
        }
        System.out.println("\n"+"Program end !!");

    }
}
