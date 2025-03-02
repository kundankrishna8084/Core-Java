package com.jspider.program.src.fileHandling;

import java.io.FileInputStream;

public class CountCharacter {
    public static void main(String[] args) throws Exception {
        System.out.println("Program starts");
        int count=0;
        try {
            FileInputStream fis=new FileInputStream("d://p8.java");
            int x=fis.read();
            while(x!=-1) {
                count++;
                x=fis.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total Characters are: "+count);
        System.out.println("Program Ends");

    }
}
