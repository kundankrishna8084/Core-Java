package com.jspider.program.src.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program13 {
    public static void main(String[] args)  throws Exception{
        System.out.println("Program start !!");

        try {
            FileReader fr = new FileReader("d:\\p10.txt");
            System.out.println((char)fr.read());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("File not Found");
        }
        System.out.println("Program end");
    }
}
