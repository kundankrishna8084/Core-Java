
package com.jspider.program.src.array;
import java.util.Arrays;
public class Program23 {
    public static void main(String[] args) {
        int [] arr = {0, 1, 1, 0, 0, 1, 0, 0};
        moveToEndOne(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveToEndOne(int[] arr) {
        int index=0;
        for (int num:arr){
            if(num==0){
                arr[index++]=num;
            }
        }
        while (index<arr.length){
            arr[index++]=1;
        }
    }

}
