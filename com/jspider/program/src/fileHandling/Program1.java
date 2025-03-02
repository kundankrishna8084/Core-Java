
package com.jspider.program.src.fileHandling;
import java.io.File;
public class Program1 {
    public static void main(String[] args) {
        System.out.println("Main Starts Here");
        File f1 =new File("d:\\p1.txt");
        File f2 =new File("d:\\p2.txt");

        try {
            f1.createNewFile();
            f2.createNewFile();
            System.out.println("File is created");
        } catch (Exception e) {
            System.out.println("File is not ");
            System.out.println(e.getMessage());
        }
        System.out.println("Main ends here");

    }
}
