package com.jspider.program.src.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Program7 {
    public static void main(String[] args)  throws IOException{
        System.out.println("Program stars!!");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("d:\\p7.txt");
            fos.write(65);
            fos.write("\n".getBytes());
            fos.write('B');
            byte [] c ={'a','b','c','d','e'};
            byte[] b = {49, 50, 51};
            fos.write(c);
            fos.write(b);
            fos.write(c,1,2);
            fos.write("mohan".getBytes());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            fos.close();
        }
        System.out.println("Program ends!!!");
    }
}
