
package com.jspider.program.src.array;
import java.util.Arrays;
public class RemoveElements {
    public static void main(String[] args) {
        int[] a = {12, 345, 678, 90, 123, 456, 5, 1001};
        int index = 3; // Index of the element to be removed
        int[] result = removeElement(a, index);
        System.out.println("Array after removing element at index " + index + ": " + Arrays.toString(result));
    }
    public static int [] removeElement(int [] a, int index){
        // Check if the index is valid

        if (index < 0 || index >= a.length) {
            System.out.println("Invalid index.");
            return a;// Return the original array if index is invalid
        }
        // Creating a new array with one less element
        int[] b = new int[a.length - 1];
        // Loop through the original array
        for (int i = 0, j = 0; i < a.length; i++) {
            if(i<index){
                b[i]=a[i];
            } else if (i>index) {
                b[i-1]=a[i];
            }
        }
        return b;
    }
}
