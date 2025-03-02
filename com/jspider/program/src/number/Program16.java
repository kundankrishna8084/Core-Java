package com.jspider.program.src.number;

public class Program16 {
    public static void main(String[] args) {

    }
    public static int test(){
        int x=30;
        int y=40;
        return x;
       // return y;//java: cannot find symbol
                   //symbol:   class return
    }
    public static int [] demo(){
        int [] x={12,18,30,40};
        int []  y ={40,50,50,89,90};
        return x;
       // return x,y; --> Error  only one value can return on time.
    }

    public static int test1(){
        int x=30;
        int y=40;
        return x+y*3+50;// Allowed because we perform an operation on return type.
    }
    public static String demo1(){
        int x=30;
        int y=40;
        return x +" "+y; // Output:- 4060
        // Return one String value for return type only.
        // Yaha per contact ho gaya isliye return ho raha hai.
    }
}
