
package com.jspider.program.src.arraysClass;
import java.util.Arrays;
public class Binarysearch2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,60,70,80,90,100};
        int key = 70;
        int startIndex=2;
        int endIndex=8;
        int index= Arrays.binarySearch(arr,startIndex,endIndex,key);
        System.out.println("Index of key is: "+index);
    }
}
