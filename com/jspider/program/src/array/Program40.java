
package com.jspider.program.src.array;
public class Program40 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 15, 15, 35, 12};
        if (sameArrayFromStartAndLAst(arr)){
            System.out.println("Array is same from start and last");
        } else {
            System.out.println("Array is not same from start and last");
        }
    }
    private static boolean sameArrayFromStartAndLAst(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Loop to compare elements from start and end
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;  // If elements do not match, return false
            }
            start++;
            end--;
        }
        return true;  // If all elements match, return true
    }
}

