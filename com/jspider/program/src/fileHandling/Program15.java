package com.jspider.program.src.fileHandling;
import java.io.*;
public class Program15 {
    public static void main(String[] args) throws Exception {
        System.out.println("Program start!!");
        try {
            FileInputStream fis=new FileInputStream("d:\\p8.java");
            System.out.println("File Is Found!");
            int x=fis.read();
            while(x!=-1) {
                System.out.print((char)x);
                x=fis.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("File not found");
        }
        System.out.println("\n"+"Program ends!!");
    }
}
