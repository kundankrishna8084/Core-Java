package com.jspider.program.src.exceptionHandling;

public class Program2 {
    public static void main(String[] args)  {
        System.out.println("Program Starts !!");
      String s1 = " Krishna is everywhere";
        System.out.println(12+40*8);
        // There is Exception in program saying that StringIndexOutOfBoundsException so we can handle with try and catch.
        try {
            System.out.println(s1.charAt(22));
            System.out.println("Program Execute !!");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println("Program not Execute !!");
        }
        System.out.println(30+50*4);
        System.out.println(56+67*2);
        System.out.println("Program ends");


    }
}
