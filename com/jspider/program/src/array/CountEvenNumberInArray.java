package com.jspider.program.src.array;

public class CountEvenNumberInArray {
    public static void main(String[] args) {
        int [] arr =  {12,34,56,78,90,89,77,55} ;
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0)
                count++;
            System.out.println("array elements are:"+arr[i]);

        }
        System.out.println("Total Even number in array:"+count);
    }
}
