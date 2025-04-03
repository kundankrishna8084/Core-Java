
package com.jspider.program.src.array;
import java.util.*;
public class Program37 {
    public static void main(String[] args) {
        int arr[] = {12, 34, 21, 78, 90, 45, 35};
        System.out.println("Before sorted Array is:"+ Arrays.toString(arr));
        sortArray(arr);
        System.out.println("After sorted Array is:"+Arrays.toString(arr));
    }
    public static void sortArray(int [] arr){
        // First, we find the size of the Array
        int n = arr.length;
        // For iteration on Array, we write the outer loop
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            // Inner loop for comparison
            for (int j = 0; j < n - 1 - i; j++) {
                // Check if the 1st element is greater than the 2nd element
                // If true, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
            // If no swapping occurred, the array is already sorted, so return
            if (count == 0)
                return;
        }

    }
}
