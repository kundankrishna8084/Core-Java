package com.jspider.program.src.array;
public class ReverseArray {
    public static void main(String[] args) {
        int [] arr =  {12, 345, 678, 90, 123, 456, 5, 1001};
        for (int array:arr)
            System.out.println("Original Array:"+array);
        for (int i = arr.length-1; i>=0 ; i--)
        System.out.println("The Reverse array is:"+arr[i]);
    }
}
