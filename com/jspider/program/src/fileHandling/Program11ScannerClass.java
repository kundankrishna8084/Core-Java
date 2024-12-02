package com.jspider.program.src.fileHandling;
import java.io.*;
import java.util.*;
public class Program11ScannerClass {
    public static void main(String[] args)  {
        System.out.println("Program starts !!");
        File f1 = new File("d:\\p10.txt");
        Scanner scn = null;
        try {
            scn = new Scanner(f1);
            while (scn.hasNextLine()){
                System.out.println(scn.hasNext());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            scn.close();
        }
        System.out.println("Program starts !!");
    }
}
