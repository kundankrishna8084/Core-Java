package com.jspider.program.src.string;

public class Program1 {
    public static void main(String[] args) {
        String s1="Mohan";
        String s2= new String("John");
        String s3 = new String("Mohan");
        String s4 = new String ("Mohan");
        String s5= "Mohan";

        // == --> It compares reference to Primitive datatype  only
        System.out.println(s1==s5);
        System.out.println(s1==s4);
        System.out.println(s4==s5);

        System.out.println("=====================");
        // equals () compared to content of non-primitive datatype
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));

    }
}
