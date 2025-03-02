package com.jspider.program.src.fileHandling;

import java.io.FileInputStream;

public class CountNumericCharacters {
    public static void main(String[] args) {
        System.out.println("Program starts!!");
        int count=0;
        try {
            FileInputStream fis=new FileInputStream("d://p8.java");
            System.out.println("File not found");
            int x=fis.read();
            while(x!=-1) {
                if(x>=48 && x<=57)
                    count++;
                x=fis.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total Numeric Characters are: "+count);
        System.out.println("Program ends!!");
    }
}
