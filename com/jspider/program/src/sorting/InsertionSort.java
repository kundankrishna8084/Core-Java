
package com.jspider.program.src.sorting;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {12, 34, 21, 78, 90, 45, 35};
        System.out.println("Before sorted Array is:"+ Arrays.toString(arr));
        sortArray(arr);
        System.out.println("After sorted Array is:"+Arrays.toString(arr));
    }
    public static void sortArray(int [] arr){
        for (int i = 1; i <arr.length ; i++) {
            int key=arr[i];
            int j=i-1;
            /// Shift elements of the sorted part to the right to make space
            while(j>=0 && arr[j]>=key) {
                arr[j + 1] = arr[j];
                j--;
            }
            /// Insert the key at its correct position
            arr[j+1]=key;
            }
        }
    }
