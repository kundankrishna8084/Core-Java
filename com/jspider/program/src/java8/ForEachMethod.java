package com.jspider.program.src.java8;

import java.util.ArrayList;

public class ForEachMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(8); al.add(5); al.add(25);al.add(7);

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
            
        }
        System.out.println("==========================");
        for (int i:al){
            System.out.println(i);
        }
        System.out.println("============================");
        al.forEach(i-> System.out.println(i));
    }
}
