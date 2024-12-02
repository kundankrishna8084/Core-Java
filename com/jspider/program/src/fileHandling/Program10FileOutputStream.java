package com.jspider.program.src.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Program10FileOutputStream {
    public static void main(String[] args) throws  Exception {
        System.out.println("Program starts!!");
        FileOutputStream fos=null;
        try {
             fos = new FileOutputStream("d:\\p10.txt");
            System.out.println("File is created");
            fos.write(100);
            fos.write("\n".getBytes());
            fos.write('@');
            fos.write("\n".getBytes());
            byte b[] = {12,34,67,90,108};
            fos.write(b);
            fos.write("\n".getBytes());
            fos.write(b,2,2);
            fos.write("\n".getBytes());
            fos.write("abcd".getBytes());
            fos.write("\n".getBytes());
            String s1 = "mohan is Here";
            fos.write(s1.getBytes());


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("File is not Created");
        }
        finally {
            fos.close();
        }
        System.out.println("Program ends !!");
    }
}
