package com.jspider.program.src.fileHandling;
import java.io.FileInputStream;
import java.io.IOException;
public class Program9 {
    public static void main(String[] args)  throws Exception{
        System.out.println("Program Starts !!");

        try {
            FileInputStream fis = new FileInputStream("d:\\p5.java");
           int x= fis.read();
           while (x!=-1){
               System.out.print((char)x);
               x=fis.read();
           }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n"+"Program ends !!");
    }
}
