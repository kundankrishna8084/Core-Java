package com.jspider.program.src.number;

import java.util.List;

public class Car {
    public static void main(String[] args) {

    }
    public static int test(){
        int x=30;
        int y=40;
        int z =x+y;
        return z; // From this method an int type value is being returned.
    }
    public static double demo(){
        return 18.45;
        //Here return type is double
    }
    public static String east(){
        return "Kundan krishna";
        //Here return type is String
    }
    public static int [] getElement(){
        int [] p={12,34,56,78,89,90};
        return p;
    }

    public static String [] getNames(){
        String [] names={"kk","mk","Rk"};
        return names;
    }
//    public static Employ demo1(){
//        Employ e1 =new Employ();
//        return e1;
//    }

    public static Car demo2(){
        return new Car();
    }

//    public static Employ [] getElements(){
//        // Multiple Object of Empty type can be returned.
//    }

//    public static List getData(){
//        // From here we can return a list of data
//    }

//    public static List<Integer> test1(){
//        // From here we can return list of integers.
//    }
}
