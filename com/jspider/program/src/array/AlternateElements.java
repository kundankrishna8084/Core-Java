
package com.jspider.program.src.array;
public class AlternateElements {
    public static void main(String[] args) {
        int [] arr =  {12, 345, 678, 90, 123, 456, 5, 1001};
        for (int i = arr.length-1; i>=0; i=i-2) {
            System.out.println("Reverse Array of alternate elements:"+arr[i]);

        }
    }
}
