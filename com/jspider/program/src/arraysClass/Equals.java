
package com.jspider.program.src.arraysClass;
import java.util.Arrays;
public class Equals {
    public static void main(String[] args) {
        int [] arr1 = {10,20,30,80,50,90};
        int [] arr2 = {10,50,90,30,80,20};
        int [] arr3 = {10,20,30,80,50,90};

        boolean result= Arrays.equals(arr1,arr2);
         boolean result1=Arrays.equals(arr1,arr3);
        System.out.println(result);
        System.out.println(result1);
    }
}
