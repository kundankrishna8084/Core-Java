package com.jspider.program.src.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        System.out.println("program Starts");
        File f1 = new File("d:\\p3.java");
        Scanner scn = null;

        try {
            scn = new Scanner(f1);
            System.out.println("File is found");
            System.out.println(scn.hasNextLine());
            System.out.println(scn.hasNext());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("File is not Found");
        }
        finally {
            scn.close();
        }
        System.out.println("program ends !!");
    }
}
