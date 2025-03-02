package com.jspider.program.src.number;

public class Program4 {
    public static void main(String[] args) {
        int x=30;
        System.out.println(x);//30
        {
            int y=40;
            System.out.println(y);//40
            System.out.println(x);//30
        }

        System.out.println(x);
       // System.out.println(y);
        //Error:-java: cannot find symbol
        //             symbol:   variable y
    }
}
