
package com.jspider.program.src.sorting;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {18,15,19,20,10,17,21};
        System.out.println("Before sorted Array is:"+ Arrays.toString(arr));
        sortArray(arr);
        System.out.println("After sorted Array is:"+Arrays.toString(arr));
    }
    public static void sortArray(int [] arr){
        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int min=arr[i];
            int index=i;
            for (int j = i+1; j <n ; j++) {
                if (min>arr[j]){
                    min=arr[j];
                    index=j;
                }
            }
            arr[index]=arr[i];
            arr[i]=min;

        }

    }
}
