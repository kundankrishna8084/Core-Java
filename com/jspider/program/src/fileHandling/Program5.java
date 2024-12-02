package com.jspider.program.src.fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args)  throws IOException{
        System.out.println("main stars here");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your String");
        String s1 = scn.nextLine();
        FileWriter fw = null;
        try {
            fw = new FileWriter("d:\\p5.java");
            fw.write(s1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            scn.close();
            fw.close();

        }
        System.out.println("Program ends");
    }
}
