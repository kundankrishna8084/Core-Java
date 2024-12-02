package com.jspider.program.src.fileHandling;

import java.io.*;

public class Program2 {
    public static void main(String[] args) {
        System.out.println("Main starts here");
           File f1 = new File("d:\\p1.txt");
           try {
               f1.createNewFile();
           }catch (Exception e){
               System.out.println(e.getMessage());
           }

       // f1.delete();
        System.out.println(f1.getTotalSpace());
        System.out.println(f1.length());
        f1.setWritable(false);
        System.out.println(f1.getAbsolutePath());
        System.out.println("Program Ends!!");
        String[] s=f1.list();
        for(String p:s)
            System.out.println(p);
    }
}
