package com.jspider.program.src.fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) throws IOException {
        System.out.println("Program stars here");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name= scn.nextLine();
        System.out.println("Enter your age");
        int age = scn.nextInt();
        System.out.println("Enter your Weight");
        double weight = scn.nextDouble();

        FileWriter fw  = null;

        try {
            fw = new FileWriter("d:\\p6.txt");
            fw.write("Name is:"+name+"\n");
            fw.write("age is:"+age+"Years");
            fw.write("\n Weight is:"+weight+"kg Unit");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            scn.close();
            fw.close();
        }
        System.out.println("Program ends!!");
    }
}
