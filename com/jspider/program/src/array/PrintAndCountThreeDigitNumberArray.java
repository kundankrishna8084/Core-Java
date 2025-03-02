package com.jspider.program.src.array;

public class PrintAndCountThreeDigitNumberArray {
    public static void main(String[] args) {
        int [] arr =  {12, 345, 678, 90, 123, 456, 5, 1001};
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>100 && arr[i]<999) {
                System.out.println("array elements are:" + arr[i]);
                count++;
            }
        }
        System.out.println("Total three digit number in array are :"+count);
    }
}
