package com.jspider.program.src.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GetSum {
    public static void main(String[] args)  throws Exception{
        System.out.println("Program starts!!");
        int sum=0;
        FileInputStream fis = null;

        try {
            fis=new FileInputStream("d://p8.java");
            int x=fis.read();
            while(x!=-1){
                if(x>=48 && x<=57)
                    sum=sum+x-48;
                x= fis.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            fis.close();
        }
        System.out.println("Total sum of numeric character " + sum);
        System.out.println("Program ends!!");

    }
}
