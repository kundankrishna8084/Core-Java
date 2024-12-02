package com.jspider.program.src.fileHandling;

import java.io.File;
import java.io.IOException;

public class Program3 {
    public static void main(String[] args) {
        System.out.println("Program Starts");
        File f1 = new File("d:\\p3.java");


        try {
            f1.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            String[] s=f1.list();
            for(String p:s)
                System.out.println(p);
        }
    }
}
