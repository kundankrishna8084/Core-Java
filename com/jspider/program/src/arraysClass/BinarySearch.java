
package com.jspider.program.src.arraysClass;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
                int[] arr = {10, 20, 30, 40, 50};
                int key = 30;

                int index = Arrays.binarySearch(arr, key);
                System.out.println("Index of key: " + index);  // Output: Index of key: 2
    }
}


