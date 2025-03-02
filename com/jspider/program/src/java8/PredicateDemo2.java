package com.jspider.program.src.java8;

import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        String [] names = {"Anushka","Anupama","Deepika","Krishna"};
        Predicate<String> p= name->name.charAt(0)=='K';

        for(String name:names){
            if(p.test(name)){
                System.out.println(name);
            }
        }
    }
}
