package com.jspider.program.src.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Program8 {
    public static void main(String[] args) throws Exception {
        System.out.println("Program starts!!");
        File f1 = new File("d:\\p8.java");
        FileWriter fw=null;
        try {
            f1.createNewFile();
             fw = new FileWriter(f1);
            System.out.println("File is created");
            fw.write(98);
            fw.write("\n");
            fw.write('@');
            fw.write("\n");
            fw.write("abcnmkl");
            fw.write("\n");
            fw.write(76+" ");
        } catch (IOException e) {
            System.out.println("File is not Created");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        finally {
            fw.close();
        }
        System.out.println("Program ends!!");
    }
}
