package com.jspider.program.src.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program8FileReadingOperation {
    public static void main(String[] args)throws IOException {
        System.out.println("Program starts !!");
      //  File f1 = new File("d:\\p4.java");

        try {
            FileReader fr =new FileReader("d:\\p4.java");
            int x = fr.read();// This method gives the ascii value of character and -1 is the end of file.

            while (x!=-1){
                // Loop will run until it will reach end of file.
                System.out.print((char)x);// It will print character for ascii value.
                x= fr.read();// It will read next Character.
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n"+"Program ends!!");


    }
}
