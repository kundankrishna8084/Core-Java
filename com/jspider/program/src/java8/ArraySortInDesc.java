package com.jspider.program.src.java8;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator;
// Without Lambda
public class ArraySortInDesc {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(8); al.add(5); al.add(25);al.add(7);

        System.out.println("Before Sorting"+al);
        Collections.sort(al, new NumberComparator());
        System.out.println("After Sort"+al);
    }
}
class  NumberComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer i, Integer j){
        if(i>j){
            return -1;
        } else if (i<j) {
            return  1;

        }
        return 0;
    }
}
