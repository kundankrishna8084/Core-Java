
package com.jspider.program.src.array;
public class Program43 {
    public static void main(String[] args) {
        int[] arr = {2,3, 7, 8, 9};
       if (sort(arr)){
           System.out.println("Array is sorted");
       }else{
           System.out.println("Array is not sorted");
       }
    }
    public static boolean sort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
}
