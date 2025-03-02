package com.jspider.program.src.array;

public class EvenElements {
    public static void main(String[] args) {
        int [] arr =  {12,34,56,78,90,89,77,55} ;
        for (int i = 0; i <arr.length ; i++) {
            if(i%2==0)
                System.out.println(arr[i]);

        }
    }
}
