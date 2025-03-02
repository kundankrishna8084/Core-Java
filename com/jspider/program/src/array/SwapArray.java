package com.jspider.program.src.array;
public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {12, 345, 678, 90, 123, 456, 5, 1001};
        int start = 0;
        int end = arr.length - 1;
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

            // Print the array after swapping
            System.out.println("Array after swapping:");
            for (int j : arr)
            System.out.println(j);


        }
    }
