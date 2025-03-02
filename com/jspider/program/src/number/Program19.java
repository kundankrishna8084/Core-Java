package com.jspider.program.src.number;

public class Program19 {
    public static void main(String[] args) {
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.pow(7,3));
        System.out.println(Math.sqrt(713));
        System.out.println(Math.cbrt(28));
        System.out.println(Math.ceil(7.3));
        System.out.println(Math.floor(7.3));
        System.out.println(Math.random());
        System.out.println(Math.abs(2-20));
        System.out.println(Math.abs(20-2));
        System.out.println(Math.max(23,44));
        System.out.println(Math.min(23,44));


        // Generate any random no of 1 digit
        System.out.println((int) (Math.random()*10));
        //Generate any random no of 100 no
        System.out.println((int)(Math.random()*100));
       // Generate any random no in given range
        int min =100;
        int max =500;
        int randomNumber = min+(int)(Math.random()*(max-min));
        // max is included
        //100+(0.9999*400)
        //100+399.6
        //499
        System.out.println("Random number in range is:"+randomNumber);


    }

}

