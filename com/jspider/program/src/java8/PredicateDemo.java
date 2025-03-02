package com.jspider.program.src.java8;

import java.util.function.Predicate;

public class PredicateDemo {
    // Method without Lambda Expression without
    // this method we can call the method with the
    // help of predicate interface.
//    public boolean test(int i){
//        if(i>10){
//            return true;
//        }else {
//            return false;
//        }
//     }
    public static void main(String[] args) {

         Predicate<Integer> p= i-> i >10;
        System.out.println(p.test(5));
        System.out.println(p.test(15));

    }
}
