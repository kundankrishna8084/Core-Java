
package com.jspider.program.src.array;
import java.util.Arrays;
public class Program22 {
    public static void main(String[] args) {
        int[] arr = {7, 0, 2, 6, 0, 4}; // Input array
        moveToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static  void moveToEnd(int [] arr){
        int index=0;
        for (int num:arr){
            if (num!=0){
                arr[index++]=num;
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }

    }
}
