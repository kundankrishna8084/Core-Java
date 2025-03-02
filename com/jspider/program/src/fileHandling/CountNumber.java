package com.jspider.program.src.fileHandling;

import java.io.FileInputStream;

public class CountNumber {
    public static void main(String[] args)  throws Exception{
        int count=0;
        try {
            FileInputStream fis=new FileInputStream("d://p8.java");
            System.out.println("File Is Found!");
            int x=fis.read();
            while(x!=-1) {
                if(x>=48 && x<=57)
                    count++;
                x=fis.read();
            }
        } catch (Exception e) {
            System.out.println("File is not Found");
            System.out.println(e.getMessage());
        }
        System.out.println("Total Numeric Characters are: "+count);
    }
}
