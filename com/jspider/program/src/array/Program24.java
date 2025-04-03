
package com.jspider.program.src.array;
import java.util.Arrays;
public class Program24 {
    public static void main(String[] args) {
        int arr [] = {0, 2, 0, 1, 2, 1, 0, 2};
        shift(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void shift(int[] arr) {
        int count0=0;
        int count1=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0)
                count0++;
            else if (arr[i]==1)
                count1++;

        }
        for (int i = 0; i < arr.length; i++) {
            if (i<count0)
                arr[i]=0;
            else if (i<count0+count1)
                arr[i]=1;
            else
                arr[i]=2;

        }
    }
}
