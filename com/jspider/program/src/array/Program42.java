
package com.jspider.program.src.array;
public class Program42 {
    public static void main(String[] args) {
        int[] arr = {2,3, 7, 8, 9};
        if (strictlyIncreasing(arr)){
            System.out.println("Array is Strictly Increasing");
        }else{
            System.out.println("Array is not Strictly Increasing");
        }
    }
    public static boolean strictlyIncreasing(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
}

